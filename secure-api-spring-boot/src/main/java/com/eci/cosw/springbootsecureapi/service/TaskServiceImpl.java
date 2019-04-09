package com.eci.cosw.springbootsecureapi.service;


import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskServiceImpl
    implements TaskService
{

    private final Map<Long, Task> tasksMap = new HashMap<>();


    @Autowired
    public TaskServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {
        tasksMap.put( 1L, new Task( 1L, "Task 1", 5, new Date() ) );
        tasksMap.put( 2L, new Task( 2L, "Task 2", 4, new Date() ) );
        tasksMap.put( 3L, new Task( 3L, "Task 3", 2, new Date() ) );
    }


    @Override
    public List<Task> getTasksList()
    {

        return new ArrayList<>( tasksMap.values() );
    }

    @Override
    public Task create( Task task )
    {
        long id = getNextTaskId();
        task.setId( id );
        tasksMap.put( id, task );
        return task;
    }

    private Long getNextTaskId()
    {
        return (long) tasksMap.size() + 1;
    }

    @Override
    public List<Task> getTasksAssignedToUser( String userId )
    {
        List<Task> userTasks = new ArrayList<>();
        for ( Task task : tasksMap.values() )
        {
            if ( task.getAssignedTo().getEmail().equals( userId ) )
            {
                userTasks.add( task );
            }
        }
        return userTasks;
    }

    @Override
    public Task assignTaskToUser( long taskId, User user )
    {
        if ( tasksMap.containsKey( taskId ) )
        {
            Task task = tasksMap.get( taskId );
            task.assignTo( user );
            return task;
        }
        else
        {
            return null;
        }
    }
}

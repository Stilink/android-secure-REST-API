package com.eci.cosw.springbootsecureapi.controller;


import com.eci.cosw.springbootsecureapi.model.AssignTaskWrapper;
import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "api" )
public class TaskController
{


    private final TaskService taskService;

    @Autowired
    public TaskController( TaskService taskService )
    {
        this.taskService = taskService;
    }

    @CrossOrigin( origins = "http://localhost:3000" )
    @RequestMapping( value = "/task", method = RequestMethod.GET )
    public List<Task> getTasksList()
    {
        return taskService.getTasksList();
    }

    @CrossOrigin( origins = "http://localhost:3000" )
    @RequestMapping( value = "/task", method = RequestMethod.POST )
    public Task createTask( @RequestBody Task task )
    {
        return taskService.create( task );
    }

    @CrossOrigin( origins = "http://localhost:3000" )
    @RequestMapping( value = "/task/assign", method = RequestMethod.POST )
    public Task assignTask( @RequestBody AssignTaskWrapper assignTaskWrapper )
    {
        return taskService.assignTaskToUser( assignTaskWrapper.getTaskId(), assignTaskWrapper.getUser() );
    }

    @CrossOrigin( origins = "http://localhost:3000" )
    @RequestMapping( value = "/task/{userId}", method = RequestMethod.GET )
    public List<Task> getUserTasks( @PathVariable String userId )
    {
        return taskService.getTasksAssignedToUser( userId );
    }

}

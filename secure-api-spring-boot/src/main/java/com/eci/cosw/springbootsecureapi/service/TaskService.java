package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;

import java.util.List;

public interface TaskService
{

    List<Task> getTasksList();

    Task create( Task task );

    List<Task> getTasksAssignedToUser( String userId );

    Task assignTaskToUser( long taskId, User user );
}

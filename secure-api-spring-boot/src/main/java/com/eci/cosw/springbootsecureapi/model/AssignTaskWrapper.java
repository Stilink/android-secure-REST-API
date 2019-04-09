package com.eci.cosw.springbootsecureapi.model;

public class AssignTaskWrapper
{
    long taskId;

    User user;


    public AssignTaskWrapper()
    {
    }

    public long getTaskId()
    {
        return taskId;
    }

    public void setTaskId( long taskId )
    {
        this.taskId = taskId;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser( User user )
    {
        this.user = user;
    }
}

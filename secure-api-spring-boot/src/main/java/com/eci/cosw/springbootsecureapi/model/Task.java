package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

public class Task
{

    private long id;

    private String description;

    private int priority;

    private User assignedTo;

    private Date dueDate;

    public Task()
    {
    }

    public Task( long id, String description, int priority, Date dueDate )
    {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setPriority( int priority )
    {
        this.priority = priority;
    }

    public Date getDueDate()
    {
        return dueDate;
    }

    public void setDueDate( Date dueDate )
    {
        this.dueDate = dueDate;
    }

    public void assignTo( User asignedTo )
    {
        this.assignedTo = asignedTo;
    }

    public User getAssignedTo()
    {
        return assignedTo;
    }

    public long getId()
    {
        return id;
    }

    public void setId( long id )
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Task{" + "description='" + description + '\'' + ", priority=" + priority + ", dueDate=" + dueDate + '}';
    }
}

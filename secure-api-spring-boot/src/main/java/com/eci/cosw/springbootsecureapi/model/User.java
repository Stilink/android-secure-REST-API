package com.eci.cosw.springbootsecureapi.model;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
public class User
{

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private RolesEnum role = RolesEnum.USER;


    public User()
    {
    }

    public User( String email, String password, String firstName, String lastName )
    {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public RolesEnum getRole()
    {
        return role;
    }

    public void setRole( RolesEnum role )
    {
        this.role = role;
    }

    @Override
    public String toString()
    {
        return "User{email='" + email + '\'' + ", password='" + password + '\'' + ", firstName='" + firstName + '\''
            + '}';
    }
}

package model;

public class User {

    private static int lastid = 100;
    private int id;
    private String name;
    private String surename;
    private int age;


    public User(String name, String surename, int age) throws UserException {

        setId();
        setName(name);
        setSurename(surename);
        setAge(age);
    }
    public int getId()
    {
        return id;
    }

    public void setId()
    {
        User.lastid++;
        this.id = User.lastid;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) throws UserException {
        if(name.length() >= 2 )
        {
            this.name = name;
        }
        else
        {
            throw new UserException("Error:name too short");
        }


    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) throws UserException {
        if(surename.length() >= 2)
        {
            this.surename = surename;
        }
        else
        {
            throw new UserException("Error: surename to short");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UserException {
        if((age >=16) && (age <= 65))
        {
            this.age = age;
        }
        else
        {
            throw new UserException("Error: to young or old...");
        }
    }

    public String toString()
    {
        return "Name: " + name + "\nSurename: " + surename + "\nAge: " + age;
    }

}

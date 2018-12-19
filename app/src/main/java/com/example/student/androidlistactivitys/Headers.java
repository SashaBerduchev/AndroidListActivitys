package com.example.student.androidlistactivitys;

public class Headers {

    private String Host;

    private String Accept_Encoding;

    private String User_Agent;

    private String Connection;

    public String getHost ()
    {
        return Host;
    }

    public void setHost (String Host)
    {
        this.Host = Host;
    }

    public String getAccept_Encoding ()
    {
        return Accept_Encoding;
    }

    public void setAccept_Encoding (String Accept_Encoding)
    {
        this.Accept_Encoding = Accept_Encoding;
    }

    public String getUser_Agent ()
    {
        return User_Agent;
    }

    public void setUser_Agent (String User_Agent)
    {
        this.User_Agent = User_Agent;
    }

    public String getConnection ()
    {
        return Connection;
    }

    public void setConnection (String Connection)
    {
        this.Connection = Connection;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Host = "+Host+", Accept-Encoding = "+Accept_Encoding+", User-Agent = "+User_Agent+", Connection = "+Connection+"]";
    }
}

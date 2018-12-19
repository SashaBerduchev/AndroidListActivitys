package com.example.student.androidlistactivitys;



public class MyPojo {

    private Headers headers;


    private String origin;

    private String url;

    public Headers getHeaders ()
    {
        return headers;
    }

    public void setHeaders (Headers headers)
    {
        this.headers = headers;
    }



    public String getOrigin ()
    {
        return origin;
    }

    public void setOrigin (String origin)
    {
        this.origin = origin;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [headers = "+headers+", args = "+", origin = "+origin+", url = "+url+"]";
    }
}

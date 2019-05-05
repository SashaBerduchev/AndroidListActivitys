package com.example.student.androidlistactivitys;



public class Humen {
    private String Name;
    private String Sername;
    private String Age;
    private String Height;
    private String Weight;

    public Humen(String Name, String Sername, String Age, String Height, String Weight)
    {
        this.Name = Name;
        this.Sername = Sername;
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSername() {
        return Sername;
    }

    public void setSername(String sername) {
        Sername = sername;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }
}

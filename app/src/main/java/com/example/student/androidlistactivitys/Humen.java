package com.example.student.androidlistactivitys;



public class Humen {
    private String Name;
    private String Sername;
    private int Age;
    private int Height;
    private int Weight;

    public Humen(String Name, String Sername, int Age, int Height, int Weight)
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

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }
}

package Device;

public class Laptop {

    private String Name;
    private String Model;
    private String Processor;
    private int Cores;
    private int Resolution;
    private String Grafics;
    private int Cost;
    private int Battery;

    public  Laptop(String name, String model, String processor, Integer cores, Integer resolution, String grafics, Integer cost, Integer battery)
    {
        Name = name;
        Model = model;
        Processor = processor;
        Cores = cores;
        Resolution = resolution;
        Grafics = grafics;
        Cost = cost;
        Battery = battery;
    }

    public String getName() {
        return Name;
    }

    public String getModel() {
        return Model;
    }

    public String getProcessor() {
        return Processor;
    }

    public int getCores() {
        return Cores;
    }

    public int getResolution() {
        return Resolution;
    }

    public String getGrafics() {
        return Grafics;
    }

    public int getCost() {
        return Cost;
    }

    public int getBattery() {
        return Battery;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public void setResolution(int resolution) {
        Resolution = resolution;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    public void setCores(int cores) {
        Cores = cores;
    }

    public void setBattery(int battery) {
        Battery = battery;
    }

    public void setGrafics(String grafics) {
        Grafics = grafics;
    }
}

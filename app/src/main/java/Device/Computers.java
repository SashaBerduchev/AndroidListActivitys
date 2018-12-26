package Device;

public class Computers {

    private String Name;
    private String Model;
    private String Processor;
    private int Cores;
    private String Grafics;
    private int Cost;

    public Computers(String name, String model, String processor, int cores, String grafics, int cost)
    {
        this.Name = name;
        this.Model = model;
        this.Processor = processor;
        this.Cores= cores;
        this.Grafics = grafics;
        this.Cost = cost;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getCores() {
        return Cores;
    }

    public void setCores(int cores) {
        Cores = cores;
    }

    public String getGrafics() {
        return Grafics;
    }

    public void setGrafics(String grafics) {
        Grafics = grafics;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public String getProcessor() {
        return Processor;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }
}

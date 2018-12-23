package Device;



public class Phones {
    private String name;
    private String model;
    private String processor;
    private String ram;
    private String grapficscore;
    private int battery;
    private  int cost;

    public Phones(String name, String model, String processor, String ram, String grapficscore, Integer battery, Integer cost)
    {
        this.name = name;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.grapficscore = grapficscore;
        this.battery = battery;
        this.cost = cost;

    }

    public String getName() {
        return name;
    }

    public int getBattery() {
        return battery;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGrapficscore() {
        return grapficscore;
    }

    public void setGrapficscore(String grapficscore) {
        this.grapficscore = grapficscore;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

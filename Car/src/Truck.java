public class Truck extends Vehicle {
    String containerType;
    public Truck(String name, String model, int price, int quantity, String type) {
        super(name, model, price, quantity);
        this.containerType=type;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }
}
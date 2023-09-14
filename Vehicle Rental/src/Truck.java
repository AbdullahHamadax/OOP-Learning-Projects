public class Truck extends Vehicle { // Truck IS-A vehicle so it makes sense
    String containerType;

    public Truck(String name, String model, int price, int quantity, String type, int manufacturingYear) {
        super(name, model, price, quantity,manufacturingYear);
        this.containerType = type;
    }

    public String getContainerType() {
        return containerType;
    }


    @Override
    public int getTaxes() {
        return 15; // 15% taxes.
    }

    @Override
    int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }
}
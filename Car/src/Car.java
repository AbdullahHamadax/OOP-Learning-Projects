public class Car extends Vehicle { // Car IS-A vehicle so it makes sense
    private String carType;
    public Car(String name, String model, int price, int quantity, String type,int manufacturingYear) {
        super(name, model, price, quantity,manufacturingYear);
        this.carType = type;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public int getTaxes() {
        return 12; // 12% taxes.
    }

    @Override
    int getManufacturingYear() {
        return manufacturingYear;
    }
}

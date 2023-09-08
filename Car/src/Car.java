public class Car extends Vehicle {
    private String carType;
    public Car(String name, String model, int price, int quantity, String type) {
        super(name, model, price, quantity);
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
}

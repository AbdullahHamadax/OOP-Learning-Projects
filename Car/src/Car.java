public class Car extends Vehicle {
    public Car(String name, String model, int price, int quantity) {
        super(name, model, price, quantity);
    }
    @Override
    public int getTaxes() {
        return 12; // 12% taxes.
    }
}

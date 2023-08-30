public class Motorcycle extends Vehicle {
    String freeBikerClothes;
    public Motorcycle(String name, String model, int price, int quantity, String free) {
        super(name, model, price, quantity);
        this.freeBikerClothes=free;
    }
}
public class Motorcycle extends Vehicle { // Motorcycle IS-A vehicle so it makes sense
    String freeBikerClothes;
    public Motorcycle(String name, String model, int price, int quantity, String free, int manufacturingYear) {
        super(name, model, price, quantity, manufacturingYear);
        this.freeBikerClothes=free;
    }

    public String getFreeBikerClothes() {
        return freeBikerClothes;
    }

    public void setFreeBikerClothes(String freeBikerClothes) {
        this.freeBikerClothes = freeBikerClothes;
    }

    @Override
    public int getTaxes() {
        return 10; // 10% taxes
    }

    @Override
    int getManufacturingYear() {
        return manufacturingYear;
    }


}
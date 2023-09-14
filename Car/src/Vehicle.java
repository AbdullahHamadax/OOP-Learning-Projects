abstract public class Vehicle {
    private String name, model;
    private int price, quantity=0, id;
    public int manufacturingYear; // I had to make it public so I can access it  within the subclasses
    private static int c=1, taxes;
    public Vehicle(String name, String model, int price, int quantity, int manufacturingYear) {
        this.id = c++;
        this.name = name;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
        this.manufacturingYear=manufacturingYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract int getTaxes();

    public void setTaxes(int taxes) {
        this.taxes = taxes;
    }

    abstract int getManufacturingYear();

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }
}

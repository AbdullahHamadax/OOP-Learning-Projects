public class Vehicle {
    private String name, model;
    private int price, quantity=0, id;
    private static int c=1, taxes;
    public Vehicle(String name, String model, int price, int quantity) {
        this.id = c++;
        this.name = name;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
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

    public int getTaxes() {
        return 2;
    }

    public void setTaxes(int taxes) {
        this.taxes = taxes;
    }

}

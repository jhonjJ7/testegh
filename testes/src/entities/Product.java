package entities;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double TotalvalueInStock(){
        return quantity * price;
    }

    public void AddProduct(int quantity){
        this.quantity += quantity;
    }

    public void RemoveProduct(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return  name + ", $ " + price + ", " + quantity + " units, total $ " + TotalvalueInStock();
    }

}
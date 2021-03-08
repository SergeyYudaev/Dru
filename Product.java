
public class Product {
    private String name;
    private int price;
    private int rate;

    public Product(String name, int price, int rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rate=" + rate +
                '}';
    }
}

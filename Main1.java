import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Product prod1 = new Product("Prod1", 200, 1);
        Product prod2 = new Product("Prod2", 150, 1);
        Product[] products = {prod1, prod2};

        new Category("Category1", products);
        new Category("Category2", new Product[]{new Product("Product1", 100, 1), new Product("Product2", 100, 1)});

        User user = new User("login", "password");
        System.out.println(user);

       Basket userBasket = user.getBasket();
        Product[] boughtProducts = userBasket.getBoughtProducts();

        user.getBasket().setBoughtProducts(products);

        System.out.println(Arrays.toString(user.getBasket().getBoughtProducts()));


    }
}

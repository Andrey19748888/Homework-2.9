import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Product {
    static Map<Product,Integer> products = new HashMap<>();

    private int price;
    private double weight;
    private String name;
    private boolean isPurchased;

    public Product(int price, double weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;


    }


    public void addProduct() throws Exception {
        addProduct(1);
    }

    public void addProduct(int howMany) throws Exception {
        if (!products.containsKey(this)) {
            checkProductCard();
            products.put(this, howMany);
        } else {
            int newAmount = products.get(this) + howMany;
            products.put(this, newAmount);
        }
    }

    private void checkProductCard() throws Exception {
        if ( name == null || name.isBlank()  || weight <= 0 ||
                price <= 0 ){
            throw new Exception ("Заполните карточку товара полностью");
        }
    }

    @Override
    public boolean equals(Object otherObject) {

        Product otherProduct = (Product)otherObject;

        if (this.name.equals(otherProduct.name)) {
            return true;
        }

        return false;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}

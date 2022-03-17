package objectClasses;

import java.util.Comparator;

public class Product implements Comparable<Product>{
    public int productId;
    public String productName;
    public double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public int compareTo(Product o) {
        return this.productName.compareTo(o.productName);
    }
}

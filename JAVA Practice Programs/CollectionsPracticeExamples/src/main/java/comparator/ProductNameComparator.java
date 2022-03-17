package comparator;

import objectClasses.Product;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
            return (product1.productName).compareTo(product2.productName);
    }
}

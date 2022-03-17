package comparator;

import objectClasses.Product;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if (product1.productPrice == product2.productPrice)
            return 0;
        else if (product1.productPrice > product2.productPrice)
            return 1;
        else
            return -1;
    }
}

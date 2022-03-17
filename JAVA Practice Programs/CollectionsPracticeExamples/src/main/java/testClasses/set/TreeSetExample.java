package testClasses.set;

import com.sun.source.doctree.SeeTree;
import comparator.ProductPriceComparator;
import objectClasses.Product;

import java.util.*;

public class TreeSetExample {
    public static void displayElements(Product product){
        System.out.println("Product ID :"+product.productId+", Product Name :"+product.productName+", Product Price :"+product.productPrice);
    }

    public static void iterateOverSet(NavigableSet<Product> products){
        Iterator<Product> productIterator = products.iterator();
        while(productIterator.hasNext()){
            Product product = productIterator.next();
            System.out.println("-----------");
            displayElements(product);
        }
    }

    public static void main(String args[]){
        NavigableSet<Product> products = new TreeSet<>(new ProductPriceComparator());
        Product product1 = new Product(1, "Laptop", 89000);
        Product product2 = new Product(2, "IPhone", 189000);
        Product product3 = new Product(3, "Car", 1500000);
        Product product4 =  new Product(4, "Villa", 10000000);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        System.out.println("*************** Initial Order of elements ***************");
        iterateOverSet(products);



    }
}

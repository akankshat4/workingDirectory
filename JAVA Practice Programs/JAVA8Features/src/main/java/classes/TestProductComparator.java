package classes;

import collectionObjects.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestProductComparator {
    public static void main(String args[]){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Laptop", 89000));
        products.add(new Product(2, "IPhone", 189000));
        products.add(new Product(3, "Car", 1500000));

        System.out.println("**********Order of Insertion**********");
        for(Product product:products){
            System.out.println("-----------");
            System.out.println("Product ID : "+product.productId+", Product Name : "+product.productName
            +", Product Price : "+product.productPrice);
        }


    }
}

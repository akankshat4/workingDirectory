package testClasses.list;

import objectClasses.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListComparableExample {
    public static void main(String args[]){
        List<Product> list = new LinkedList<>();
        list.add(new Product(1, "Laptop", 89000));
        list.add(new Product(2, "IPhone", 189000));
        list.add(new Product(3, "Car", 1500000));
        list.add(2, new Product(4, "Villa", 10000000));

        // original ordering of elements
        for(Product product:list){
            System.out.println("-----------");
            System.out.println("Product ID : "+product.productId+", Product Name : "+product.productName
                    +", Product Price : "+product.productPrice);
        }

        Collections.sort(list);

        System.out.println("******************************************************");
        //  ordering of elements based on product name
        for(Product product:list){
            System.out.println("-----------");
            System.out.println("Product ID : "+product.productId+", Product Name : "+product.productName
                    +", Product Price : "+product.productPrice);
        }
    }
}

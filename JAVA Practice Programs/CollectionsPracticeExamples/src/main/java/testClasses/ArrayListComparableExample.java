package testClasses;

import objectClasses.Product;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListComparableExample {
    public static void main(String args[]){
        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(new Product(1, "Laptop", 89000));
        arrayList.add(new Product(2, "IPhone", 189000));
        arrayList.add(new Product(3, "Car", 1500000));
        arrayList.add(2, new Product(4, "Villa", 10000000));

        // original ordering of elements
        for(Product product:arrayList){
            System.out.println("-----------");
            System.out.println("Product ID : "+product.productId+", Product Name : "+product.productName
                    +", Product Price : "+product.productPrice);
        }

        Collections.sort(arrayList);

        System.out.println("******************************************************");
        //  ordering of elements based on product name
        for(Product product:arrayList){
            System.out.println("-----------");
            System.out.println("Product ID : "+product.productId+", Product Name : "+product.productName
                    +", Product Price : "+product.productPrice);
        }
    }
}

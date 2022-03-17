package testClasses.arrayList;

import comparator.ProductNameComparator;
import comparator.ProductPriceComparator;
import objectClasses.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListComparatorExample {
    public static void main (String args[]){
        List<Product> arrayList = new ArrayList<>();
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

        System.out.println("********** Ordering based on Product-Price **********");
        Collections.sort(arrayList,new ProductPriceComparator());
        for(Product product:arrayList){
            System.out.println("-----------");
            System.out.println("Product ID : "+product.productId+", Product Name : "+product.productName
                    +", Product Price : "+product.productPrice);
        }

        System.out.println("********** Ordering based on Product-Name **********");
        Collections.sort(arrayList, new ProductNameComparator());
        for(Product product:arrayList){
            System.out.println("-----------");
            System.out.println("Product ID : "+product.productId+", Product Name : "+product.productName
                    +", Product Price : "+product.productPrice);
        }

        System.out.println("********** Reverse ordering based on Product-Price **********");
        Collections.sort(arrayList, Collections.reverseOrder(new ProductPriceComparator()));
        for(Product product:arrayList){
            System.out.println("-----------");
            System.out.println("Product ID : "+product.productId+", Product Name : "+product.productName
                    +", Product Price : "+product.productPrice);
        }
    }
}

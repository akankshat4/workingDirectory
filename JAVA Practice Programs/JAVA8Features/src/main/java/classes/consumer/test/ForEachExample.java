package classes.consumer.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
    public static void main (String args[]){
        List<Integer> list = new ArrayList<>();

        for (int i=1;i<=10;i++){
            list.add(i);
        }

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}

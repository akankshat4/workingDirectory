package classes;

import functionalInterfaces.Square;

public class TestSquare {
    public static void main(String args[]){
        int a = 5;
        Square square = (int parameter)-> parameter * parameter;
        int answer = square.calculate(a);
        System.out.println(answer);
    }
}

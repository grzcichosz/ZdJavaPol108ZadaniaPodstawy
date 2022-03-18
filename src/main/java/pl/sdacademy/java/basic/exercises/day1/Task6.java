package pl.sdacademy.java.basic.exercises.day1;

public class Task6 {
    public static void main(String[] args) {
        printMultiplicationTable(6,2,5);
    }
    public static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand){
        for(int i = minMultiplicand; i <=maxMultiplicand; i++ ){
            int result = multiplier * i;
            System.out.println(multiplier + " * " + i + " = " + result);
        }
    }
}

package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;

        String  primeNumbers = "";
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        scanner.close();

        for(i = 2; i <=num; i++){
            if(num % i == 0){
                System.out.println(num);
            }
        }
    }
}


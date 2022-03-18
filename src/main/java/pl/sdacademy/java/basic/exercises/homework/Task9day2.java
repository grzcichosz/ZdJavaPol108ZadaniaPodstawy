package pl.sdacademy.java.basic.exercises.homework;

import java.util.Scanner;

public class Task9day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        if(input.equals("Enough")){
            System.out.println("Result: ");
        }
        else {
            System.out.println("Please insert your text: ");
            input = scanner.nextLine();
        }
    }
}

package pl.sdacademy.java.basic.exercises.homework;

import java.util.Scanner;

public class Task9day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String longestInput = "";

        while(true) {
            System.out.print("Please insert your text: ");
            input = scanner.nextLine();

            if(input.isBlank()){
                System.out.println("no input");
            }
            else if(input.equals("Enough")){
                break;
            }

            if(input.length() > longestInput.length()){
                longestInput = input;
            }
        }
        System.out.println(longestInput);
    }
}

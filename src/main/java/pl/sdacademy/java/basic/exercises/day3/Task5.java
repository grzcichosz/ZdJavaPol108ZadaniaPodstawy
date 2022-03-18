package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.print("To start timing press ENTER");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        LocalTime startTime = LocalTime.now();
        System.out.println("To stop timing press ENTER");
        scanner.nextLine();
        LocalTime stopTime = LocalTime.now();
        Duration time = Duration.between(startTime,stopTime);
        //time.getSeconds();
        System.out.println("Total time= " + time.getSeconds() + " sec.");



    }

}

package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task6 {

    public static final String INPUT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert date in format: [" + INPUT_DATE_FORMAT + "]");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(INPUT_DATE_FORMAT);
        LocalDateTime nextLesson = LocalDateTime.parse(input, formatter);

        LocalDateTime now = LocalDateTime.now();

        long days = Duration.between(now, nextLesson).toDays();
        System.out.println(days);
    }
}

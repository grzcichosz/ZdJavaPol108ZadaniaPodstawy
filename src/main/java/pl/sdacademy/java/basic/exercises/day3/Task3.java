package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static final String NUMBER_REGEX = "-?\\d+(,\\d+)?";

    public static void main(String[] args) {
        System.out.println(isCorrectNumberFormat("1234,1234"));
        System.out.println(isCorrectNumberFormat(",1234"));
        System.out.println(isCorrectNumberFormat("12a1234"));
        System.out.println(isCorrectNumberFormat("-1234,1234"));
        System.out.println(isCorrectNumberFormat("1"));
        System.out.println(isCorrectNumberFormat(""));
        System.out.println(isCorrectNumberFormat(","));

    }
    private static boolean isCorrectNumberFormat(String number){

        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}

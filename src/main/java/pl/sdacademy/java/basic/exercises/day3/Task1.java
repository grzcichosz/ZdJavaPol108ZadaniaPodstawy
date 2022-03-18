package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static final String EMAIL_REGEX = "[a-zA-Z0-9._]+\\@[a-zA-Z]+(\\.[a-zA-Z]+)*";

    public static void main(String[] args) {

        System.out.println(isCorrectEmailFormat("aaa@com.pl.pl"));
        System.out.println(isCorrectEmailFormat("aaa@com.pl"));
        System.out.println(isCorrectEmailFormat("@com.pl"));
        System.out.println(isCorrectEmailFormat("aaa@"));
        System.out.println();
        System.out.println(isCorrectEmailFormat("aaa@@sda.pl"));
    }

    private static boolean isCorrectEmailFormat(String emailAddress){

        // sda@com.pl sda@com sda@sda.com.pl
        // sda1@com.pl
        // sda1@@com.pl
        //sda_1@com.pl
        // s.da@com.pl

        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }
}

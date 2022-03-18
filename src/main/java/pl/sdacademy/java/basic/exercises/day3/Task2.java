package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static final String IBAN_NUM = "PL[0-9]{25}";

    public static void main(String[] args) {
        System.out.println(isCorrectIBAN("PL1010500099760312345678123"));
        System.out.println(isCorrectIBAN("1010500099760312345678123PL"));
        System.out.println(isCorrectIBAN("1010500099PL"));
    }
    private static boolean isCorrectIBAN(String IBANNum){

        Pattern pattern = Pattern.compile(IBAN_NUM);
        Matcher matcher = pattern.matcher(IBANNum);
        return matcher.matches();
    }
}

package pl.sdacademy.java.basic.exercises.day2;

public class Task1 {
    public static void main(String[] args) {
        String input = "domeK";
        char result = getLastChar(input);
        System.out.println("Original char: " + input);
        System.out.println("Last char: " + result);
    }

    private static char getLastChar(String input){
        int lastPos = input.length()-1;
        return input.charAt(lastPos);
    }

}

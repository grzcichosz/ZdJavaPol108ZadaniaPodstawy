package pl.sdacademy.java.basic.exercises.day2;

public class Task11 {
    public static void main(String[] args) {
        String input = "kajak";
        System.out.println(isPalindrome(input));
        StringBuilder sb = new StringBuilder("ala ma kota");
        sb.append(" i psa");
        System.out.println(sb);
    }

    private static boolean isPalindrome(String input){
        int length = input.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = input.charAt(forward++);
            char backwardChar = input.charAt(backward--);
            if (forwardChar != backwardChar){
                return false;
            }
        }
        return true;
    }
}

package pl.sdacademy.java.basic.exercises.day2;

public class Task2 {
    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        String suffix = "nie";
        System.out.println("Prefix: " + prefix);
        System.out.println("Input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input,prefix));

         input = "";
         prefix = "pro";
         suffix = "nie";
        System.out.println("Prefix: " + prefix);
        System.out.println("Input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input,prefix));

        input = null;
        prefix = "pro";
        suffix = "nie";
        System.out.println("Prefix: " + prefix);
        System.out.println("Input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input,prefix));

        input = "programowanie";
        prefix = null;
        suffix = "nie";
        System.out.println("Prefix: " + prefix);
        System.out.println("Input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input,prefix));

    }
    private static boolean isWordContainsPrefix(String input, String prefix){
        if(input != null && !input.isBlank() && prefix != null && !prefix.isBlank()) {
            return input.startsWith(prefix);
        }
        return false;
    }

}

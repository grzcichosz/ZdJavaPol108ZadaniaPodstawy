package pl.sdacademy.java.basic.exercises.homework;


public class Task8day2 {
    public static void main(String[] args) {
        String input = "AlaKot";
        System.out.println(reverseLetters(input));

    }

    private static String reverseLetters(String input2){
        char[] chars = input2.toCharArray();
        int i;
        for(i =0; i < chars.length;i++){
            chars[i] = Character.isUpperCase(chars[i])? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}

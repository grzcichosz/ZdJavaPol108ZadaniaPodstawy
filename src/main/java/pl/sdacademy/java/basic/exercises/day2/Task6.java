package pl.sdacademy.java.basic.exercises.day2;

public class Task6 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedCharacter = 'z';
        System.out.println("Input: " + input);
        System.out.println("Searched Character: " + searchedCharacter);
        System.out.println("Result: " + getIndex(input,searchedCharacter));
    }
    private static int getIndex(String input , char searchedCharacter){

        for(int i =0; i < input.length(); i++){
            if(input.charAt(i) == searchedCharacter){
                return i;
            }
        }

        return -1;
    }
}

package pl.sdacademy.java.basic.exercises.day2;

public class Task7 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        System.out.println(getPercent(input));
    }
    private static double getPercent(String input) {
        if (StringHelper.isValid(input)) {
            double spaceCount = 0;
            int i = 0;
            for (; i < input.length(); i++)
                if (input.charAt(i) == ' ' || input.charAt(i) == '\n' || input.charAt(i) == '\t')
                    spaceCount++;


            return (spaceCount / input.length()) * 100;
        }
        return -1;
    }
}

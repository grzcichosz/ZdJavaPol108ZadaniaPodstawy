package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task4 {
    final static float BMIlowerLimit = 18.5f;
    final static float BMIhigherLimit = 24.9f;
    public static void main(String[] args) {

        System.out.println("Please insert weight in kg: ");
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();
        System.out.println("Please insert height in cm: ");
        int height = scanner.nextInt();
        float heightCM = (float) height/100;
        BMICalculate(weight,heightCM);
        BMIdisplay(BMICalculate(weight,heightCM));
    }
    public static float BMICalculate(float weight, float heightCM){

        return (weight/(heightCM*heightCM));
    }
    public static void BMIdisplay(float BMI){
        System.out.println(BMI);
        if(BMI >= BMIlowerLimit && BMI <=BMIhigherLimit){
            System.out.println("BMI is correct!");
        }
        else{
            System.out.println("BMI is not correct!");
        }
    }
}

package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task4 {
    final static float BMI_LOWER_LIMIT = 18.5f;
    final static float BMI_HIGHER_LIMIT = 24.9f;
    public static void main(String[] args) {

        System.out.println("Please insert weight in kg: ");
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();
        System.out.println("Please insert height in cm: ");
        int height = scanner.nextInt();
        float heightCM = (float) height/100;
        float bmi = BMICalculate(weight,heightCM);
        BMIdisplay(bmi);
    }
    public static float BMICalculate(float weight, float heightCM){

        return (weight/(heightCM*heightCM));
    }
    public static void BMIdisplay(float BMI){
        System.out.println(BMI);
        if(BMI >= BMI_LOWER_LIMIT && BMI <=BMI_HIGHER_LIMIT){
            System.out.println("BMI is correct!");
        }
        else{
            System.out.println("BMI is not correct!");
        }
    }
}

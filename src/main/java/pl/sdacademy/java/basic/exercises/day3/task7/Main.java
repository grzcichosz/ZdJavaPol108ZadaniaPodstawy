package pl.sdacademy.java.basic.exercises.day3.task7;

public class Main {
    public static void main(String[] args) {
        Cat [] cats = new Cat[3];
        cats[0] = new Cat("mruczek");
        cats[1] = new Cat("filemon");
        cats[2] = new Cat("bonifacy");

        int i =2;

        for(Cat element: cats){
            element.print();
            element.makeSound();
            element.eatMice(i++ * i);
            System.out.println();
        }

//        Cat cat = new Cat("burek");
//        System.out.println(cat);
//        cat.print();
    }
}

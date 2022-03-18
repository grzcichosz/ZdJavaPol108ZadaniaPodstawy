package pl.sdacademy.java.basic.exercises.day3.Task8;

public class Author {
    private String name;
    private String nationality;

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public void print(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

package pl.sdacademy.java.basic.exercises.day3.Task8;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stefan","Scottish");
        Author author2 = new Author("Jill","American");
        //System.out.println(author1);
        System.out.println();
        Poem poem1 = new Poem(author1,4);
        Poem poem2 = new Poem(author2,10);
        Poem poem3 = new Poem(author1,8);
       // System.out.println(poem1);
        Poem [] poems = new Poem[3];
        poems[0] = poem1;
        poems[1] = poem2;
        poems[2] = poem3;


        String author = getNameWithMaxStropheNumbers(poems);
        System.out.println(author);
    }
    private static String getNameWithMaxStropheNumbers(Poem[] poems){
        int max = 0;
        String name = null;
        for(Poem poem:poems){
            int currentStropheNumbers = poem.getStropheNumbers();
            if(max < currentStropheNumbers){
                max = currentStropheNumbers;
                name = poem.getCreator().getName();
            }
        }
        return name;
    }
}

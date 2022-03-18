package pl.sdacademy.java.basic.exercises.day3.Task9;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    double getAmount(){

        return quantity * price;
    }

    boolean isCorrect(){

        return quantity > 0 && price > 0;
    }

    void print(){
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append("\t | ");
        sb.append(price).append(" zł \t| ");
        sb.append(quantity).append(" pcs \t| ");
        sb.append(getAmount()).append(" zł");
        System.out.println(sb);
    }
}

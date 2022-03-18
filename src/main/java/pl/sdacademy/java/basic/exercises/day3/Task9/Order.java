package pl.sdacademy.java.basic.exercises.day3.Task9;

public class Order {
    private int maxOrderItem;
    private OrderItem[] orderItems;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
    }

    boolean addItem(OrderItem orderItem){
        if(!orderItem.isCorrect()){
            System.out.println("Item is incorrect");
            return false;
        }
        return false;
    }
}

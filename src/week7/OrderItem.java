package week7;

public class OrderItem {
    private Fruit fruit;
    private int quantity;

    public OrderItem(Fruit fruit, int quantity) {
        this.fruit = fruit;
        this.quantity = quantity;
    }
    public Fruit getFruit() {
        return fruit;
    }
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}

package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entitiesEnum.OrderStatus;

public class Order {
    private LocalDateTime moment;
    private OrderStatus orderStatus;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(){}

    public Order(OrderStatus orderStatus, Client client) {
        this.moment = LocalDateTime.now();
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double n = 0;
        for (OrderItem item : items) {
            n+= item.subTotal();
        }
        return n;
    }
    
}

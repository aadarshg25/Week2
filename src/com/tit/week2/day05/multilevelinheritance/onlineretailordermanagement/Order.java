package com.tit.week2.day05.multilevelinheritance.onlineretailordermanagement;

class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    public void displayInfo() {
        System.out.println("Order ID: " + orderId + "\nOrder Date: " + orderDate);
    }
}


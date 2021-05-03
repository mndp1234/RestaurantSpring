package com.smartrestaurants.demo.model;

import javax.persistence.*;

@Entity(name = "order_details")
public class Order_details {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_details_id;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Orderr orderr;

    private double food_amount;

    private int no_serving;

    private double total_amount;

    public Order_details(){
        super();
    }

    public Order_details(double food_amount, int no_serving, double total_amount) {
        this.food_amount = food_amount;
        this.no_serving = no_serving;
        this.total_amount = total_amount;
    }

    public int getOrder_details_id() {
        return order_details_id;
    }

    public void setOrder_details_id(int order_details_id) {
        this.order_details_id = order_details_id;
    }

    public Orderr getOrder() {
        return orderr;
    }

    public void setOrder(Orderr orderr) {
        this.orderr = orderr;
    }

    public double getFood_amount() {
        return food_amount;
    }

    public void setFood_amount(double food_amount) {
        this.food_amount = food_amount;
    }

    public int getNo_serving() {
        return no_serving;
    }

    public void setNo_serving(int no_serving) {
        this.no_serving = no_serving;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
}

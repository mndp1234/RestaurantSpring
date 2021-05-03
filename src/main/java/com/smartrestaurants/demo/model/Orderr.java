package com.smartrestaurants.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="orderr")
public class Orderr {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderr_id;

    private double total_amount;

    private int orderr_status;

    private String customer_name;

    private String customer_email;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "orderr")
    private List<Order_details> order_details = new ArrayList<Order_details>();

    public Orderr(){
        super();
    }

    public Orderr(double total_amount, int orderr_status, String customer_name, String customer_email) {
        this.total_amount = total_amount;
        this.orderr_status = orderr_status;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
    }

    public int getOrderr_id() {
        return orderr_id;
    }

    public void setOrderr_id(int orderr_id) {
        this.orderr_id = orderr_id;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public int getOrderr_status() {
        return orderr_status;
    }

    public void setOrderr_status(int orderr_status) {
        this.orderr_status = orderr_status;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public List<Order_details> getOrder_details() {
        return order_details;
    }

    public void setOrder_details(List<Order_details> order_details) {
        this.order_details = order_details;
    }
}

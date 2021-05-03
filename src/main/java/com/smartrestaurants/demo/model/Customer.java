package com.smartrestaurants.demo.model;

import javax.persistence.*;


@Entity(name="customer")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customer_id;

    private String customer_name;

    @Column(unique = true)
    private String customer_email;

    private String customer_password;

    public Customer(String customer_name, String customer_email, String customer_password) {
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_password = customer_password;
    }
    public Customer(){
        super();
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int id) {
        this.customer_id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String name) {
        this.customer_name = name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String email) {
        this.customer_email = email;
    }

    public String getCustomer_password() {
        return customer_password;
    }

    public void setCustomer_password(String password) {
        this.customer_password = password;
    }

}

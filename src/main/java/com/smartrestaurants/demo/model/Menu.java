package com.smartrestaurants.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int menu_id;

    private String menu_name;

    private double price;

    private String image;

    private int menu_status;

    public Menu(){
        super();
    }

    public Menu(String menu_name, double price, String image, int menu_status) {
        this.menu_name = menu_name;
        this.price = price;
        this.image = image;
        this.menu_status = menu_status;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getMenu_status() {
        return menu_status;
    }

    public void setMenu_status(int menu_status) {
        this.menu_status = menu_status;
    }
}

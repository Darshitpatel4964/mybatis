package com.mybatis.demo.model;

/**
 * This Books.java class is declare all Books data  entity.
 * @author Darshit Patel
 */

public class Books {
    private String name;
    private int price;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

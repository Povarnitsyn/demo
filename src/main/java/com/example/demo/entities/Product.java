package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Product {
    public Product(String name,int price, List<Specifications> specifications){
        this.specifications=specifications;
        this.name=name;
        this.price=price;
    }
    public Product(String name,int price){
        this.name=name;
        this.price=price;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int price;
    int sortOrder;
    boolean active;
    @OneToMany(mappedBy = "product")
    List<Specifications> specifications;
    public List<Specifications> getSpecifications () {
        return  specifications;
    }

    public Product() {

    }

    public int getId () {
        return  id;
    }
    public String getName () {
        return  name;
    }
    public int getPrice () {
        return  price;
    }
    public boolean getActive () {
        return  active;
    }
    public int getSortOrder () {
        return  sortOrder;
    }
}

package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Specifications {

        public Specifications(String key1, int value){
            this.key1=key1;
            this.value1 =value;
        }
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;
        String key1;
        int value1;
        int sortOrder;
        boolean active;
        @ManyToOne
        @JoinColumn(name="productId", nullable = false)
        Product product;
        public Product getProduct () {
        return  product;
    }

        public Specifications() {

        }

        public int getId () {
            return  id;
        }
        public String getKey () {
            return  key1;
        }
        public int getValue1() {
            return value1;
        }
        public boolean getActive () {
            return  active;
        }
        public int getSortOrder () {
            return  sortOrder;
        }
    }


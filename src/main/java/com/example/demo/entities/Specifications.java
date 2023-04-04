package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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


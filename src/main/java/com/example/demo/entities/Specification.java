package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Specification {

        public Specification(String key, int value){
            this.key=key;
            this.value=value;
        }
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;
        String key;
        int value;
        int sortOrder;
        boolean active;

        public Specification() {

        }

        public int getId () {
            return  id;
        }
        public String getKey () {
            return  key;
        }
        public int getValue () {
            return  value;
        }
        public boolean getActive () {
            return  active;
        }
        public int getSortOrder () {
            return  sortOrder;
        }
    }


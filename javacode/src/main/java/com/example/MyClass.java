package com.example;

import java.util.ArrayList;
import java.util.Collection;

public class MyClass {
    class Order{
        private double orderTotal;
        private Collection<OrderItem> orderItems;

        public Order(){
            this.orderItems = new ArrayList<OrderItem>();
        }
    }

    class OrderItem {

    }
}

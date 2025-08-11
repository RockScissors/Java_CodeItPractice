package org.example.Head02_OOPProgramming.example03_CRY;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    //List->인터페이스
    private List<Product> products;
    private boolean isPaid;

    //생성자
    public Order(){
        this.orderId = "None";
        this.products = new ArrayList<>();
        // List 인터페이스의 구현체(Implementation)인 ArrayList 객체를 생성하여,
        // products 필드(변수)에 그 주소값을 할당
        this.isPaid = false;
    }

    public Order(String orderId, List<Product> products){
        this.orderId = orderId;
        this.products = products;
        this.isPaid = false;
    }

    public Order(String orderId){
        this(orderId, new ArrayList<>());
    }





    public String getOrderId(){
        return orderId;
    }


    public List<Product> getProducts() {
        return products;
    }

    public boolean isPaid() {
        return isPaid;
    }
}


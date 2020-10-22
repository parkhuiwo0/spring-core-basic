package com.parkhuiwo0.core.singleton;

/**
 * 공유되지 않는 지역변수, 파라미터, ThreadLocal 등을 사용해야 한다.
 */
public class StatefulService {

//    private int price; // 상태를 유지하는 필드

    public int order(String name, int price) {
        System.out.println("name = " + name + "price = " + price);
//        this.price = price; // 여기가 문제!

        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}

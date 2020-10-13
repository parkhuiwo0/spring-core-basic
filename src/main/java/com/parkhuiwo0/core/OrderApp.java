package com.parkhuiwo0.core;

import com.parkhuiwo0.core.member.Grade;
import com.parkhuiwo0.core.member.Member;
import com.parkhuiwo0.core.member.MemberService;
import com.parkhuiwo0.core.member.MemberServiceImpl;
import com.parkhuiwo0.core.order.Order;
import com.parkhuiwo0.core.order.OrderService;
import com.parkhuiwo0.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
//        MemberService memberService = new MemberServiceImpl();
//        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(memberA);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
        System.out.println("order = " + order.calculatePrice());
    }
}

//package com.parkhuiwo0.core.order;
//
//import com.parkhuiwo0.core.AppConfig;
//import com.parkhuiwo0.core.member.Grade;
//import com.parkhuiwo0.core.member.Member;
//import com.parkhuiwo0.core.member.MemberService;
//import com.parkhuiwo0.core.member.MemberServiceImpl;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class OrderServiceTest {
//
////    MemberService memberService = new MemberServiceImpl();
////    OrderService orderService = new OrderServiceImpl();
//    MemberService memberService;
//    OrderService orderService;
//
//    @BeforeEach
//    public void beforeEach() {
//        AppConfig appConfig = new AppConfig();
//        memberService = appConfig.memberService();
//        orderService = appConfig.orderService();
//    }
//
//    @Test
//    void createOrder() {
//        Long memberId = 1L;
//        Member memberA = new Member(memberId, "memberA", Grade.VIP);
//        memberService.join(memberA);
//
//        Order order = orderService.createOrder(memberId, "itemA", 10000);
//        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
//    }
//}

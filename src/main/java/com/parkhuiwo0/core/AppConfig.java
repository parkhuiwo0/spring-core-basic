package com.parkhuiwo0.core;

import com.parkhuiwo0.core.discount.DiscountPolicy;
import com.parkhuiwo0.core.discount.FixDiscountPolicy;
import com.parkhuiwo0.core.member.MemberRepository;
import com.parkhuiwo0.core.member.MemberService;
import com.parkhuiwo0.core.member.MemberServiceImpl;
import com.parkhuiwo0.core.member.MemoryMemberRepository;
import com.parkhuiwo0.core.order.OrderService;
import com.parkhuiwo0.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

}

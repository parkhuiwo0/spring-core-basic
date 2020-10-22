package com.parkhuiwo0.core;

import com.parkhuiwo0.core.discount.DiscountPolicy;
import com.parkhuiwo0.core.discount.RateDiscountPolicy;
import com.parkhuiwo0.core.member.MemberRepository;
import com.parkhuiwo0.core.member.MemberService;
import com.parkhuiwo0.core.member.MemberServiceImpl;
import com.parkhuiwo0.core.member.MemoryMemberRepository;
import com.parkhuiwo0.core.order.OrderService;
import com.parkhuiwo0.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // @Bean memberService -> new MemoryMemberRepository()
    // @Bean orderService -> new MemoryMemberRepository()

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}

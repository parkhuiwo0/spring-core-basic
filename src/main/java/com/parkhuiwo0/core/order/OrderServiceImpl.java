package com.parkhuiwo0.core.order;

import com.parkhuiwo0.core.discount.DiscountPolicy;
import com.parkhuiwo0.core.discount.FixDiscountPolicy;
import com.parkhuiwo0.core.discount.RateDiscountPolicy;
import com.parkhuiwo0.core.member.Member;
import com.parkhuiwo0.core.member.MemberRepository;
import com.parkhuiwo0.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    /**
     * DIP 위반 (구체 클래스에 의존하고 있음.)
     * 추상화에 의존하라.
     */
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
//    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}

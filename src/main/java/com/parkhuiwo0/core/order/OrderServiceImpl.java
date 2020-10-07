package com.parkhuiwo0.core.order;

import com.parkhuiwo0.core.discount.DiscountPolicy;
import com.parkhuiwo0.core.discount.FixDiscountPolicy;
import com.parkhuiwo0.core.member.Member;
import com.parkhuiwo0.core.member.MemberRepository;
import com.parkhuiwo0.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}

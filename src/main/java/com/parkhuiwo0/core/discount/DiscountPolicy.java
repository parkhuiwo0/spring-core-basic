package com.parkhuiwo0.core.discount;

import com.parkhuiwo0.core.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);


}

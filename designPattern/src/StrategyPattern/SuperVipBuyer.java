package StrategyPattern;

import java.math.BigDecimal;

/**
 * 超级会员
 */

public class SuperVipBuyer implements Buyer {
    @Override
    public Integer calPrice(Integer orderPrice) {
        return orderPrice*4;
    }
}

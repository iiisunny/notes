import java.math.BigDecimal;

/**
 * 专属会员
 */

public class ParticularlyVipBuyer implements Buyer {


    @Override
    public Integer calPrice(Integer orderPrice) {
        return orderPrice*2;
    }
}
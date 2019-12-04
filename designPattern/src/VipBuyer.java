import java.math.BigDecimal;

/**
 * 普通会员
 */
public class VipBuyer implements Buyer {

    @Override
    public Integer calPrice(Integer orderPrice) {
        return orderPrice*8;
    }
}

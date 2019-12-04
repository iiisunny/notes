import java.math.BigDecimal;

public interface Buyer {

    /**
     * 计算应付价格
     */
    public Integer calPrice(Integer orderPrice);
}
package StrategyPattern;

public class Cashier {
    /**
     * 策略对象
     */
    private Buyer buyer;

    public Cashier(Buyer buyer){
        this.buyer = buyer;
    }
    public Integer quote(Integer orderPrice){
        return this.buyer.calPrice(orderPrice);
    }

}

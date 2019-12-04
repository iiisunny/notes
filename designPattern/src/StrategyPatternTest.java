import java.math.BigDecimal;

public class StrategyPatternTest {
    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        Buyer strategy = new VipBuyer();
        //创建上下文
        Cashier cashier = new Cashier(strategy);
        //计算价格
        Integer quto = cashier.quote(300);
        System.out.println("普通会员商品的最终价格是：" + quto);

        strategy = new SuperVipBuyer();
        cashier = new Cashier(strategy);
        quto = cashier.quote(300);
        System.out.println("超级会员商品的最终价格是：" + quto);

        strategy = new ParticularlyVipBuyer();
        cashier = new Cashier(strategy);
        quto = cashier.quote(300);
        System.out.println("专属商品的最终价格是：" + quto);
    }
}

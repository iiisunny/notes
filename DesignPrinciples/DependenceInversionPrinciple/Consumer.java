package DependenceInversionPrinciple;

/**
 * 消费者角色，会购买不同的商品
 */

public class Consumer {
    public void shopping(Shop shop){
        System.out.println(shop.sell());
    }

}

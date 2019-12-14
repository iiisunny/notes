package DependenceInversionPrinciple;

/**
 * 依赖倒置原则:
 * 不管顾客类 Customer 访问什么商店场所，或者增加新的商店场所，都不需要修改原有代码（开闭原则）
 * 各个商店场所维护自己卖什么就可以
 */
public class DependenceInversionPrincipleTest {
    public static void main(String[] args) {

        Consumer xiaoming = new Consumer();

        System.out.println("小明的伙食如下：");
        
        xiaoming.shopping(new TrainShop());
        xiaoming.shopping(new Airplane());
    }
}

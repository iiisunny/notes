package DependenceInversionPrinciple;

/**
 * 火车餐
 */
public class TrainShop implements Shop {
    @Override
    public String sell() {
        return "火车餐：泡面、矿泉水、瓜子";
    }
}

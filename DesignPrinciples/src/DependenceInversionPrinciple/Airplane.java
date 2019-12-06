package DependenceInversionPrinciple;

/**
 * 飞机餐
 */
public class Airplane implements Shop {
    @Override
    public String sell() {
        return "飞机餐：盒饭、饮料、面包";
    }
}

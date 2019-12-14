package InterfaceSegregationPrinciple;

/**
 * 接口隔离原则:
 * 学生使用学生成绩管理程序的不同模块时不会错乱
 * 各个模块都有各自的指责
 */
public class InterfaceSegregationPrincipleTest {
    public static void main(String[] args) {

        InputModule input = new Students();
        CountModule count = new Students();
        PrintModule print = new Students();

        input.insert();
        count.countTotalScore();
        print.printStuInfo();
    }
}

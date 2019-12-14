package LeastKnowledgePrinciple;

/**
 * 迪米特法则(最少知识原则):
 * 明星不与商演公司、粉丝直接接触，而是通过经纪人统筹
 */
public class LeastKnowledgePrincipleTest {
    public static void main(String[] args) {

        Agent agent = new Agent();
        agent.setStar(new Star("李沁"));
        agent.setFans(new Fans("粉丝小王"));
        agent.setCompany(new Company("中国传媒"));

        agent.meeting();
        agent.business();
    }
}

import com.sailyang.*;

/**
 * @author yangfan
 * @version 1.0
 * @description: 动态代理客户端代码
 * @date 2024/9/11 19:27
 */
public class ConcertHandlerTest {
    public static void main(String[] args) {
//        HuangNiuHandle huangNiuHandle = new HuangNiuHandle();
        SingleHuangNiuHandle huangNiuHandle = new SingleHuangNiuHandle();
        Human human = (Human) huangNiuHandle.getProxyInstance(new Me());

        human.eat();
        human.lookConcert();

        System.out.println("--------------------");

        Animal dog = (Animal) huangNiuHandle.getProxyInstance(new Dog());
        dog.eat();
        dog.lookDoctor();
    }
}

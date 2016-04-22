package proxy;

/**
 * Created by shining.cui on 2016/4/22.
 * 代理模式(proxy)：为其他对象提供一种代理以控制对这个对象的访问
 * 题目说明：A同学请B同学帮忙向女同学“校花”送礼物示爱
 *
 * 看似是Proxy对象完成的服务，其实Proxy对象内部由另外一个对象完成了，接受参数实际上是给其真正完成的对象使用。
 */
public class Main {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl();

        mm.setName("xiaoHua");

        Proxy proxy = new Proxy(mm);

        proxy.giveDoll();

        proxy.giveFlower();

        proxy.giveChocolate();
    }
}

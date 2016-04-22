package proxy;

/**
 * Created by shining.cui on 2016/4/22.
 * 追求者类
 */
public class Pursuit implements ShowLove {
    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDoll() {
        System.out.println(mm.getName() + "送你娃娃！");
    }

    @Override
    public void giveFlower() {
        System.out.println(mm.getName() + "送你鲜花！");

    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "送你巧克力！");

    }
}

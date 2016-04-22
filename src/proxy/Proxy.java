package proxy;

/**
 * Created by shining.cui on 2016/4/22.
 * 代理类
 */
public class Proxy implements ShowLove {
    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDoll() {
        gg.giveDoll();
    }

    @Override
    public void giveFlower() {
        gg.giveFlower();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}

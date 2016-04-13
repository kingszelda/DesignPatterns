package decorator;

/**
 * Created by shining.cui on 2016/4/13.
 */
public class Finery extends Person {

    protected  Person component;

    public void Decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}

class TShirts extends Finery {
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}

class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}

class FootballShoes extends Finery {
    @Override
    public void show() {
        System.out.println("破球鞋");
        super.show();
    }
}
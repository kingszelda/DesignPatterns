package factoryMethod;

/**
 * Created by shining.cui on 2016/4/22.
 */
public interface Factory {
    LeiFeng createLeiFeng();
}

class UndergraduateFactory implements Factory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}

class VolunteerFactory implements Factory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}

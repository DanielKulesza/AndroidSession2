package scs2682.session2;

/**
 * Created by Jurgis on 2016-09-20.
 */

public class DogFromAbstractMammal extends AbstractMammal {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public int getLegs() {
        return 0;
    }

    @Override
    public void setLegs(int legs) {

    }


}

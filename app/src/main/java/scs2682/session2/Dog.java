package scs2682.session2;



/**
 * Created by Jurgis on 2016-09-20.
 */

public class Dog implements Mammal {
    protected int legs;
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public int getLegs() {
        return legs;
    }

    @Override
    public void setLegs(final int legs) {
        this.legs = legs > 0  ? legs : 0;
    }

    public boolean isGuardDog(){
        return false;
    }
}

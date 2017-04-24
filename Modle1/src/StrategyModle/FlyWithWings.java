package StrategyModle;

/**
 * Created by jelly on 2017/4/24.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("yes i can fly!");
    }
}

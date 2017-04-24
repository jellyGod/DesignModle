package StrategyModle;

/**
 * Created by jelly on 2017/4/24.
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("yes i can quack okay!");
    }
}

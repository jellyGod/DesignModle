package StrategyModle;

/**
 * Created by jelly on 2017/4/24.
 */
public class GamePlay {
    public static void main(String[] args){
        //init a duck
        Duck dk = new DonaldDuck();
        //set behavior
        dk.setFlyBehavior(new FlyWithWings());
        dk.setQuackBehavior(new Squack());
        //then we just play it
        dk.performFly();
        dk.performQuack();
        dk.swim();
        dk.display();
    }
}

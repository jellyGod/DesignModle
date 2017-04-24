package StrategyModle;

/**
 * Created by jelly on 2017/4/24.
 */
public class DonaldDuck extends Duck {

    @Override
    public void swim() {
          System.out.println("i can swim!");
    }

    @Override
    public void display() {
           System.out.println("i can display!");
    }
}

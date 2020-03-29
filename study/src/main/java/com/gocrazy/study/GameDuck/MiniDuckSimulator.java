package com.gocrazy.study.GameDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

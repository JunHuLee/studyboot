package com.gocrazy.study.GameDuck;

public interface FlyBehavior {
    void fly();
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("날 수 있어");
    }
}

class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("날 수 없어");
    }
}



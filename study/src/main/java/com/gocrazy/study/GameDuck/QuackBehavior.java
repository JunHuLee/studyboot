package com.gocrazy.study.GameDuck;

public interface QuackBehavior {
    void quack();
}

class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("꽥꽥");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("조용");
    }
}

class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("삑");
    }
}

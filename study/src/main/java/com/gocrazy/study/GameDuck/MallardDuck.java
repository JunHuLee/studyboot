package com.gocrazy.study.GameDuck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}

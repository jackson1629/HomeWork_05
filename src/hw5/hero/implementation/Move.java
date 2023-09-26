package hw5.hero.implementation;

import hw5.hero.interfaces.MoveInterface;

public class Move implements MoveInterface {//實作介面，實現不同的功能
    @Override
    public void move() {
        System.out.println("跑步");
    }
}

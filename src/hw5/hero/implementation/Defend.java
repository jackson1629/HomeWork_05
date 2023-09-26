package hw5.hero.implementation;

import hw5.hero.interfaces.DefendInterface;

public class Defend implements DefendInterface {//實作介面，實現不同的功能
    @Override
    public void defend() {
        System.out.println("做防禦動作");
    }
}

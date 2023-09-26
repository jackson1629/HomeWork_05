package hw5.hero.implementation;

import hw5.hero.interfaces.AttackInterface;

public class ArrowManAttack implements AttackInterface {//實作介面，實現不同的功能
    @Override
    public void attack(){
        System.out.println("放弓箭");
    }
}

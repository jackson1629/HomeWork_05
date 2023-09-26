package hw5.hero;

import hw5.hero.interfaces.AttackInterface;
import hw5.hero.interfaces.DefendInterface;
import hw5.hero.interfaces.MoveInterface;

public abstract class Hero {
    // 省略 getter/setter...

    private String name;
    private int level;
    private double exp;

    private AttackInterface attackInterface;//介面類別交由子類別來實例化 AttackInterface attackInterface = new ArrowManAttack();
    private DefendInterface defendInterface;
    private MoveInterface moveInterface;

    public Hero() {
        this("David", 1, 0);
    }

    public Hero(String name, int level, double exp) {
        this.name = name;
        this.level = level;
        this.exp = exp;
    }

    public void setAttackBehavior(AttackInterface attackBehavior) {
        this.attackInterface = attackBehavior;
    }//實例化怎樣的物件，交由使用者Main來做決定

    public void setDefendBehavior(DefendInterface defendBehavior) {
        this.defendInterface = defendBehavior;
    }

    public void setMoveBehavior(MoveInterface moveBehavior) {
        this.moveInterface = moveBehavior;
    }

    protected void attack() {//實例化的物件呼叫對應的介面方法
        attackInterface.attack();
    }

    protected void move() {
        moveInterface.move();
    }

    protected void defend() {
        defendInterface.defend();
    }

}

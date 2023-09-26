package hw5.hero;

import hw5.hero.implementation.ArrowManAttack;
import hw5.hero.implementation.Defend;
import hw5.hero.implementation.Move;
import hw5.hero.implementation.SwordManAttack;

public class RoleGameTest {

    public static void main(String[] args) {
        Hero saber = new SwordMan("亞拉岡", 1, 0);
        Hero archer = new ArrowMan("勒苟拉斯", 1, 0);

        saber.setAttackBehavior(new ArrowManAttack());
        saber.setMoveBehavior(new Move());
        saber.setDefendBehavior(new Defend());

        archer.setAttackBehavior(new SwordManAttack());
        archer.setMoveBehavior(new Move());
        archer.setDefendBehavior(new Defend());

        saber.attack();
        saber.move();

        archer.attack();
        archer.move();
    }

}

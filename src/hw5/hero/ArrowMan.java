package hw5.hero;

public class ArrowMan extends Hero {//有了介面實現各種職業的行為模式，各個職業只需要初始化人物資料即可

    public ArrowMan() {
        super();
    }

    public ArrowMan(String name, int level, double exp) {//繼承父類別Hero的constructor，用來初始化各職業的人物資料
        super(name, level, exp);
    }

//    @Override
//    public void attack() {
//        System.out.println("放弓箭");
//    }
//
//    @Override
//    public void move() {
//        System.out.println("跑步");
//    }
//
//    @Override
//    public void defend() {
//        System.out.println("做防禦動作");
//    }
}

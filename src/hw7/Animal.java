package hw7;

import java.io.Serializable;

public abstract class Animal implements Serializable {//抽象父類別Animal實作序列化
    private static final long serialVersionUID =1L;//固定版本，避免因物件資料的改變，無法取得尚未更改前的資料
    abstract void speak();//抽象方法
}

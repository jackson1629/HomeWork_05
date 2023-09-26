package hw6;

public class CalException extends Exception {//自訂例外

    public CalException() {
    }

    public CalException(String message) {//使用父類別Exception的constructor，用於自訂例外訊息
        super(message);
    }
}

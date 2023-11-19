package hw9;

public class BigEater {
    public static void main(String[] args) {
        Thread moonThread = new Thread(new MoonThread());
        Thread jamesThread = new Thread(new JamesThread());

        moonThread.start();
        jamesThread.start();

        try {
            moonThread.join();
            jamesThread.join();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("============大胃王比賽結束============");
    }
}

class MoonThread implements Runnable {

    int counter = 0;

    public void run() {
        try {
            System.out.println("饅頭人開始比賽！");
            while (counter <= 10) {

                System.out.println("               " + "饅頭人吃了" + counter + "碗飯");
                counter++;
                Thread.sleep((int) (Math.random() * 2500) + 500);//Sleep時間由亂數產生500~3000之間的毫秒數
            }
            System.out.println("               " + "饅頭人吃完了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class JamesThread implements Runnable {

    int counter = 0;

    public void run() {
        try {
            System.out.println("詹姆士開始比賽！");
            while (counter <= 10) {

                System.out.println("詹姆士吃了" + counter + "碗飯");
                counter++;
                Thread.sleep((int) (Math.random() * 2500) + 500);//Sleep時間由亂數產生500~3000之間的毫秒數
            }
            System.out.println("詹姆士吃完了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

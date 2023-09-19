package Hw4;

public class CountHighestScore {
    public static void main(String[] args) {

        CountHighestScore countHighestScore = new CountHighestScore();

        int[][] scoreArray = {
                {10, 37, 100, 77, 98, 90},//1號學生的成績
                {35, 75, 70, 95, 70, 80},//2號學生的成績
                {40, 77, 79, 70, 89, 100},//3號學生的成績
                {100, 89, 90, 89, 90, 75},//4號學生的成績
                {90, 64, 75, 60, 75, 50},//5號學生的成績
                {85, 75, 70, 75, 90, 20},//6號學生的成績
                {75, 70, 79, 85, 89, 99},//7號學生的成績
                {70, 95, 90, 89, 90, 75}//8號學生的成績
        };

        countHighestScore.countHighestScore(scoreArray);
    }
    public void countHighestScore(int[][] scoreArray){//計算學生最高分次數的方法

        int[] highestScoresCount = new int[scoreArray.length];//宣告陣列，用於計算每位學生的最高分次數，長度為學生人數

        for (int i = 0; i < scoreArray.length; i++){//初始化最高分次數
            highestScoresCount[i] = 0;
        }

        for (int j = 0; j < scoreArray[0].length; j++) {//先比較第二維的第一個元素，也就是第一次小考成績

            int highestScore = 0;//預設最高分為0

            for (int i = 0; i < scoreArray.length; i++) {
                if(scoreArray[i][j] > highestScore){//如果當前分數大於最高分，用當前分數將其取代
                    highestScore = scoreArray[i][j];
                }
            }

            for (int i = 0; i < scoreArray.length; i++) {
                if(scoreArray[i][j] == highestScore){//如果當前分數為最高分，該學生的最高分次數加1
                    highestScoresCount[i]++;
                }
            }
        }
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.println((i + 1) + " 號的最高分次數為 " + highestScoresCount[i] + " 次");
        }
    }
}

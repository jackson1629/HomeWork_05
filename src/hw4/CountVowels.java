package hw4;

public class CountVowels {
    public static void main(String[] args) {

        CountVowels totalVowels = new CountVowels();

        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};

        totalVowels.countVowels(planets);
    }

    public void countVowels(String[] planets) {//計算陣列中的字串元素，各個母音的總數，最後進行加總

        int total = 0;

        for (String s : planets) {//遍歷每個字串元素
            total += countVowelsInString(s);//將每個字串元素的母音總數相加
        }

        System.out.println("共有" + total + "個母音");
    }

    public int countVowelsInString(String s) {//計算單一一個字串的母音總數

        int count = 0;

        for (char c : s.toCharArray()) {//將字串轉為字元陣列，並進行遍歷
            if ("aeiou".indexOf(c) != -1) {//一旦當前字元不為5種母音其中之一，indexOf(c)回傳-1。為a e i o u，則回傳"aeiou"字串的位置0 1 2 3 4
                count++;
            }
        }
        return count;
    }
}

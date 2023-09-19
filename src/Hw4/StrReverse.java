package Hw4;

import java.util.Stack;

public class StrReverse {
    public static void main(String[] args) {

        StrReverse strReverse = new StrReverse();

        String str = "Hello World";

        strReverse.reverseString(str);
    }

    public void reverseString(String str) {

        Stack<Character> stack = new Stack<>();//創立字串堆疊的物件
        StringBuffer stringBuffer = new StringBuffer();//字串緩衝，用於改變字串

        for (char c : str.toCharArray()) {//使用迭代器遍歷字元陣列
            stack.push(c);//堆疊LIFO
        }

        while (!stack.isEmpty()) {//如果堆疊不為空
            stringBuffer.append(stack.pop());//將後進的字元取出放入字串緩衝
        }

        System.out.println(stringBuffer.toString());//印出反轉的字串
    }
}

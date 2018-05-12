package com.learn.algorithm.evaluate;

import java.util.Stack;

/**
 * @author wangzhenya
 */
public class Evaluate {


    public static void main(String[] args) {
        System.out.println(evaluate("(((1+2)*6)/7)") );
    }

    public static int  evaluate(String expression) {

        if (expression == null || expression.length() == 0) {
            return 0;
        }
        Stack<String> opStack = new Stack<String>();
        Stack<Integer> numStack =  new Stack<Integer>();

        char[] expressionArray = expression.toCharArray();
        for (char c : expressionArray) {
            if (c == '(') {

            } else if (isOp(c)) {
                opStack.push(String.valueOf(c));
            } else if (isNum(c)) {
                numStack.push(c - '0');
            } else {
                int value2 = numStack.pop();
                int value1 = numStack.pop();
                String op = opStack.pop();
                int value = operation(value1, value2, op);
                numStack.push(value);
            }
        }
        return numStack.pop();
    }

    public static int operation(int value1, int value2, String op) {
        if (op.equals("+")) {
            return value1 + value2;
        } else if (op.equals("-")) {
            return value1 - value2;
        } else   if (op.equals("*")) {
            return value1 * value2;
        }else {
            return value1 / value2;
        }
    }

    public static boolean isOp(char c) {
        if (c == '+') {
            return true;
        }

        if (c == '-') {
            return true;
        }

        if (c == '*') {
            return true;
        }

        if (c == '/') {
            return true;
        }

        return false;

    }


    public static boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }


}

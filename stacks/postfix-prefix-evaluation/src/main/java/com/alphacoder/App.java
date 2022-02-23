package com.alphacoder;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        String s= "2 3 * 5 4 * + 901 -";
        System.out.println(evaluatePostfixExpression(s));

        String s1= "-,+,*,2,3,*,5,4,901";
        System.out.println(evaluatePrefixExpression(s1));
    }

    public static int evaluatePostfixExpression(String s){
        Stack<Integer> stack= new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' ' || s.charAt(i)==','){
                continue;
            }
            if(isOperator(s.charAt(i))){
                int operand2= stack.pop();
                int operand1= stack.pop();
                stack.push(performOperation(operand1, operand2, s.charAt(i)));
            }
            StringBuilder operand= new StringBuilder();
            if(isNumeric(s.charAt(i))){
                while(i<s.length() && isNumeric(s.charAt(i))) {
                    operand.append(s.charAt(i));
                    i++;
                }
                i--;
                stack.push(Integer.parseInt(operand.toString()));
                operand= new StringBuilder();
            }
        }

        return stack.pop();
    }

    private static int performOperation(int operand1, int operand2, char operation){
        if(operation=='+'){
            return operand1+operand2;
        }
        else if(operation=='-'){
            return operand1-operand2;
        }
        if(operation=='*'){
            return operand1*operand2;
        }
        if(operation=='/'){
            return operand1/operand2;
        }
        System.out.println("Not a valid operation.");
        return -1;
    }

    private static boolean isOperator(char operation){
        if(operation=='+' || operation=='-' || operation=='*' || operation=='/'){
            return true;
        }
        return false;
    }
    private static boolean  isNumeric(char ch){
        if(ch>='0' && ch<='9'){
            return true;
        }
        return false;
    }

    public static int evaluatePrefixExpression(String s){
        Stack<Integer> stack= new Stack<>();
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' ' || s.charAt(i)==','){
                continue;
            }
            if(isOperator(s.charAt(i))){
                int operand1= stack.pop();
                int operand2= stack.pop();
                stack.push(performOperation(operand1, operand2, s.charAt(i)));
            }
            StringBuilder operand= new StringBuilder();
            if(isNumeric(s.charAt(i))){
                while(i<s.length() && isNumeric(s.charAt(i))) {
                    operand.append(s.charAt(i));
                    i--;
                }
                i++;
                operand=operand.reverse();
                stack.push(Integer.parseInt(operand.toString()));
                operand= new StringBuilder();
            }
        }

        return stack.pop();
    }
}

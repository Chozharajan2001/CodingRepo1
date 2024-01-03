/*
EVALUATE REVERSE POLISH NOTATION
Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /. Each operand may be an integer or another expression. For
example:
["2", "1", "+", "3","*"] -> ((2 + 1) * 3) -> 9
["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

*/
import java.util.Stack;
public class ReversePolishNotation{
    public static void evaluate(String[] tokens){
        String operators = "+-*/";
        Stack<String> stack = new Stack<String>();
        for(String t:tokens){
            if(!operators.contains(t)){
                stack.push(t);
            }
            else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch(t){
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a-b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a/b));
                        break;
                }
                
            }
        }
        int value=Integer.valueOf(stack.pop());
        System.out.println(value);
    }
    public static void main(String[] args){
        String[] tokens = {"2", "1", "+", "3", "*"};
        evaluate(tokens);
    }
}


/*
Swapping Two Numbers without using Temp variable
*/
public class Swap{
    int a=10;
    int b=20;
    public static void main(String[] args){
        Swap s = new Swap();
        swapNumbers(s);
        System.out.println("a is "+s.a+" "+"b is "+s.b);
    }
    public static void swapNumbers(Swap s){
        s.a = s.a+s.b;
        s.b = s.a-s.b;
        s.a = s.a-s.b;
        
    }
}

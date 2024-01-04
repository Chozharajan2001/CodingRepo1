/*
Fibonacci Series
*/
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number: ");
        int num = sc.nextInt();
        toPrint(num);
    }
    public static void toPrint(int num){
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 1; i<=num; i++){
            System.out.print(a+"\n");
            a = b;
            b = c;
            c = a+b;
        }
    }
    
}

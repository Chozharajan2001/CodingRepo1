import java.util.Scanner;
public class FibonacciRecurcive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the occurence of sequence: ");
        int num = sc.nextInt();
        sc.close();
        toPrint(num);
    }
    //To print the fibonacci seires
    public static void toPrint(int num){
        for(int i = 0; i<num; i++){
            System.out.print(fib(i)+" ");
        }
    }
    // To perform fibonacci recursion
    public static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}

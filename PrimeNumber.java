/*
To find wheather the Given Number is Prime Number or Not
*/
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number: ");
        int num = sc.nextInt();
        System.out.println(toFind(num));
    }
    public static boolean toFind(int num){
      //If number is 1 or 0 then it should be not prime
        if(num == 1 || num == 0)
            return false;
      //If number is 2 then it should be prime  
      if(num == 2)
            return true;
      //logic to find prime number
      for(int i=2; i<=num/2; i++){
            if(num%i == 0)
                return false;
      }
      //if it is a prime number then it will return TRUE
        return true;
    }
    
}

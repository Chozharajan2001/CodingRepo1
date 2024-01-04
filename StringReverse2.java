// Reverse a String in Java program
// Using StringBuilder class
public class StringReverse2{
    public static void main(String[] args){
        String s="Sanjay";
        StringReverse2 sr = new StringReverse2();
        System.out.println(sr.reverse(s));
    }
    public String reverse(String s){
       
        StringBuilder s2 = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
           s2.append(s.charAt(i));
        }
        
        return s2.toString();
    }
}


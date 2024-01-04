// Reverse a String in Java program
// Using character array method
public class StringReverse1{
    public static void main(String[] args){
        String s="Sanjay";
        StringReverse1 sr = new StringReverse1();
        System.out.println(sr.reverse(s));
    }
    public String reverse(String s){
        char[] rev = new char[s.length()];
        int j=0;
        for(int i=s.length()-1; i>=0; i--){
            rev[j] = s.charAt(i);
            j++;
        }
        String s2 = new String(rev);
        return s2;
    }
}


//To find wheather the given string is palindrome or not

public class PalindromeString{
    public static void main(String[] args){
        String word1 = "mom";
        String word2 = "mummy";
        System.out.println(palindrome(word1));
        System.out.println(palindrome(word2));
        
    }
    public static boolean palindrome(String s){
        if(s.length() == 0){
            throw new IllegalArgumentException("String does not be null ");
        }
        for(int i=0; i<s.length()/2; i++){
            //if not palindrome it returns false
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
            
        }
        //if palindrome it returns true
        return true;
    }
}

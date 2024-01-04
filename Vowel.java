/*
To find the string contains vowel or Not
*/
public class Vowel{
    public static void main(String[] agrs){
        String word = "HEllO";
        System.out.println(findVowel(word));
        String word2 = "MGR";
        System.out.println(findVowel(word2));

    }
    public static boolean findVowel(String s){
        String vowel= "aeiou";
        String a = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(vowel.contains(String.valueOf(a.charAt(i)))){
                return true;
            }
        }
        return false;
    }
}

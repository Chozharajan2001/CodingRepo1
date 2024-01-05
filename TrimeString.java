
//To remove the white spaces in front and last of the String
/*

String s = "  Trime the String. ";
s = s.strip();
System.out.println(s);
YOU CAN ALSO USE THIS MOTHOD BUT LETS TRY DIFFERENT

*/
public class TrimString{
    public static void main(String[] args){
        String sentence = "  Trime the string.  ";
        trimString(sentence);
    }
    public static void trimString(String s){
        StringBuilder sb = new StringBuilder();
        char[] charAr = s.toCharArray();
        int pos = 0;
        //Logic to find where the string is starting
        for(int i=0; i<charAr.length; i++){
            if(charAr[i] != ' '){
                pos = i;
                break;
            }
        }
        //Logic to trim at front
        for(int i=pos; i<charAr.length; i++){
            sb.append(charAr[i]);
        }
        //Logic to trim at last
        for(int i=sb.length()-1; i>=0; i--){
            if(sb.charAt(i) != ' '){
                break;
            }
            sb.deleteCharAt(i);
        }
        System.out.println(sb);
    }
}

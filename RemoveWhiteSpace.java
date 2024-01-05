//To remove all the white spaces in the string
public class RemoveWhiteSpace{
    public static void main(String[] args){
        String word = " Hello World ";
        removeSpace(word);
    }
    public static void removeSpace(String s){
        if(s.length() == 0)
            throw new IllegalArgumentException("String does not be null ");
        StringBuilder word = new StringBuilder();
        char[] charAr = s.toCharArray();
        for(char ch : charAr){
            if(ch != ' '){
                word.append(ch);
            }
            
        }
        System.out.println(word);
    }
}
// To remove all the white spaces in the string without StringBuilder
// 
//
//public class RemoveWhiteSpace{
//     public static void main(String[] args){
//         String word = " Hello World ";
//         removeSpace(word);
//     }
//     public static void removeSpace(String s){
//         if(s.length() == 0)
//             throw new IllegalArgumentException("String does not be null ");
//         String word = new String();
//         char[] charAr = s.toCharArray();
//         for(char ch : charAr){
//             if(ch != ' '){
//                 word = word+ch;
//             }
//         }
//         System.out.println(word);
//     }
// }

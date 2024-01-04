// To find wheather the Odd number is present in a list   or not
import java.util.List;
import java.util.ArrayList;
public class OddNumber{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.print(toFindOdd(list));
    }
    public static boolean toFindOdd(List<Integer> list){
        for(int i:list){
            if(i%2!=0)
                return true;
        }
        return false;
    }
}

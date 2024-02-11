//To find the Peek element in a given array
class PeekElement{
    public static void main(String[] args){
        int[] arr={10,20,15,69,90,80};
        System.out.println(peek(arr));
    }
    public static int peek(int[] arr){
        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        //return firt element if the element is greater than it's next neibhour element
        if(arr[0]>=arr[1]){
            return arr[0];
        }
        //return last element if the element is greatder than it's previous element
        if(arr[n-1]>=arr[n-2]){
            return arr[n-1];
        }
        //Traversing the array from the index 1 to n-1
        for(int i=1; i<=n-1; i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }
}

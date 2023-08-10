import java.util.Arrays;

public class Selection{
    public static void main(String[] args) {
        int[] arr={-7,4,-8};
       selectsort(arr);
        System.out.println(Arrays.toString((arr)));
    }
    static void selectsort(int [] arr){
    for(int i=0;i<=arr.length-1;i++){
        int last=arr.length-1-i;
        int getmaxindex=maximum(arr,0,last);
        swap(arr, getmaxindex, last);
    }
    }        
    static int maximum(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
        
    }
    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
       arr[second]=temp;
    }
}


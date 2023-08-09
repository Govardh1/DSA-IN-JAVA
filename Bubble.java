import java.util.Arrays;

public class Bubble{
  public static void main(String[] args) {
    int[] arr={3,1,5,4,2};
    int[] ans=BubbleSort(arr);
    System.out.println(Arrays.toString(ans));
  } 
  static int[] BubbleSort(int[] arr){
    boolean issorted;
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    return arr; 
  } 
}
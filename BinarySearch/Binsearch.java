package BinarySearch;

public class Binsearch {
    public static void main(String[] args) {
      int[] arr={2,3,4,5,6,7,8,9,10,12,14,16,18,19}  ;
      int target=15;
      int ans=binarySearch(arr, target);
      System.out.println(ans);
    }
    // return the index 
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2; 
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return arr[start];
    }
    
}

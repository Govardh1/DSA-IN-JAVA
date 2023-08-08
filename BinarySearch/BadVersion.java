package BinarySearch;

public class BadVersion {
    public static void main(String[] args) {
        int n=1;
        
        int ans =firstBadVersion(n);
        System.out.println(ans);
    }
    static int firstBadVersion(int n){
        int start=1;
        int end=n; int bad=4;
        // boolean isBadVersion;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>=bad){
           end = mid-1;
            }else{
                start=mid+1;
            }
        }
         return start;
    }
  
}

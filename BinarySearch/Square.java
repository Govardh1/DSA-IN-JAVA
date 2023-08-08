package BinarySearch;

public class Square {
    public static void main(String[] args) {
       int x=8;
       int ans=Binsea(x);
        System.out.println(ans);
    }
    static int Binsea(int x){
        int start=1;
        int end=x;
        while(start<=end){
            int mid= start+(end-start)/2;
            int sqmid=mid*mid;
            if(sqmid>x){
                end=mid-1;
            }else if(sqmid<x){
                start=mid+1;
            }else{
                return mid;
            }  
        }
        return Math.round(end);
    }
}

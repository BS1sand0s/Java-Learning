package Practice;
public class FindRange{
public class Program {
    public static void main(String args[]){
        int arr[]={0 ,1 ,5 ,8 ,14 ,18 ,44 ,81 ,89, 99 ,102};
        int first=44;
        int last=99;

        findCount(arr,arr.length,first,last);

    }

    private static void findCount(int[] arr, int length, int first, int last) {
        int firstIndex,lastIndex;
        int low=0;
        int high=length-1;
        int mid;
        //FirstIndex
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>=first){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        firstIndex=low;
        low=0;
        high=length-1;
        //LastIndex
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]<=last){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        lastIndex=high;
        System.out.println(lastIndex-firstIndex+1);
    }
}
}
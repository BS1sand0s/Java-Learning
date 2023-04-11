package Practice;

public class CountOnesBinaryArray {

    public static void main(String args[]){
        int arr[]={0,1,1,1,1,1,1,1,1};
        int start=0;
        int count=0;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==0){
                low=mid+1;
            }
            if(mid==0 || arr[mid]!=arr[mid-1]){
                start=mid;
                break;
            }else if(arr[mid]==1){
                high=mid-1;
            }

        }

        System.out.println(arr.length-start);

    }
}

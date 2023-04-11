package Practice;

public class SearchInfiniteArray {

    public static void main(String args[]){
        int[] arr={1,21,99};
        int x=22;
        int i=1;
        while(arr[i]<x){
            if(arr[i]<x){
                i=i*2;
            }else{
                break;
            }
        }
        System.out.println("End-index"+i);
        int low=0;
        int high=i;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                System.out.println("Found"+mid);
                break;
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
    }
}

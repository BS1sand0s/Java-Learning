package Practice;
import java.util.*;
public class InsertionSort{
    public static void main(String args[]){
        int arr[]={5, 10, 20 ,30, 45, 15, 50};
        for(int i=1;i<arr.length;i++){
            int j=i-1; //0
            int key = arr[i];
            while(j>=0 && arr[j]>arr[i] ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

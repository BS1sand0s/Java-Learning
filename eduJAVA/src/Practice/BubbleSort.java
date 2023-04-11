package Practice;

public class BubbleSort {
    public static void main(String args[]){
        int arr[]={1,2,5,1,15};
        boolean check=false;
        for(int i=0; i<arr.length; i++)
        {
            check=false;
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    check=true;
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(!check){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

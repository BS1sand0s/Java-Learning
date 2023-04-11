package Practice;

public class SelectionSort {
    public static void main(String args[]){
        int nums[]={10,5,8,20,2,18};
        for(int i=0;i<nums.length;i++){
            int minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex=j;
                }
            }
            swap(i,minIndex,nums);
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static void swap(int i,int m,int[] nums){
        int temp=nums[i];
        nums[i]=nums[m];
        nums[m]=temp;
    }
}

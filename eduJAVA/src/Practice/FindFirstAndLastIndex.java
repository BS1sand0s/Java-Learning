package Practice;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] solutions=new int[2];
        solutions[0]=calculateFirst(nums,target) ;
        solutions[1]=calculateLast(nums,target);
        return solutions;
    }

    public int calculateFirst(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int res=-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else {
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
    public int calculateLast(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int res=-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else {
                res=mid;
                low=mid+1;
            }
        }
        return res;
    }
}

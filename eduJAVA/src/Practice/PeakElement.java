package Practice;

class Solution {
    public int findPeakElement(int[] nums) {
        
        int low = 0;
        int high = nums.length -1;
        
        if(nums.length==1){
            return 0;
        }
         if(nums.length==2){
            if(nums[0]>nums[1]){
                return 0;
            } else{
                return 1;
            }
        }
        while (low <= high) {
            int mid = (low + high)/2;
            System.out.println(mid);
            if (( mid==nums.length -1 || nums[mid] > nums[mid+1] ) && (mid==0 || nums[mid] > nums[mid -1]) )  {
                return mid;
            } else if (nums[mid +1] > nums[mid]) {
                low = mid +1;
            } else {
                high = mid-1;
            }
        }
        
        return -1;
    }
    
    
}

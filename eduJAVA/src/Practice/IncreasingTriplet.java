package Practice;

public class IncreasingTriplet {
        public boolean increasingTriplet(int[] nums) {
            int i;
            int nextNum = Integer.MAX_VALUE;
            int minSoFar = nums[0];
            for ( i = 1; i < nums.length; i++) {
                if (nums[i] > nextNum) return true;
                else if (nums[i] < minSoFar) {
                    minSoFar = nums[i];
                } else if (nums[i] > minSoFar) {
                    nextNum = nums[i];
                }
            }
            return false;
        }
}

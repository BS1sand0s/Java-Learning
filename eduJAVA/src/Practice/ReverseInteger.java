package Practice;

class Solution {
    int rem=0;
    long result=0;
    public int reverse(int x) {
        
        while(x!=0){
            rem=x%10;
            result=(result*10)+rem;
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
            x=x/10;
        }
        return (int)result;
    }
}

package Practice;

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());//testcases
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(reader.readLine());//input n
            //printing "1" if isLucky() returns true else "0"
            Solution s = new Solution();
            System.out.println(s.isLucky(n)? "1" : "0");
        }
    }
}

class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        // Your code here

        int s = isLuckyVal(n,2);
        if(s==0){
            return false;
        }else{
            return true;
        }
    }
    
    
    public static int isLuckyVal(int n , int val){
        
        if(n<val){
            return 1;
        }
        
        if(n%val==0){
            return 0;
        }
        
        return isLuckyVal(n-(n/val),val+1);
        
    }
}

package Practice;

public class commonPREFIX {
	String longestCommonPrefix(String arr[], int n){
		
        String ans="";
        char [] k =arr[0].toCharArray();
        int i=0;
        for(char ch:k){
            for(int N=1;N<n;N++){
               if( ch!=arr[N].toCharArray()[i]){
                   if(ans=="")
                   return "-1";
                return ans;
               }
            }ans+=ch;
        i++;
        }
        return ans;
            
        }

}

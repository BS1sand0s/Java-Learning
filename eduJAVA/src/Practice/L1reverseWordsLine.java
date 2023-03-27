package Practice;
import java.util.Scanner;

public class L1reverseWordsLine {
	public static String reverseWords(String S)
    {
        String [] str= S.split("[.]");
        String temp="";
        for(int i= str.length-1;i>=0;i--){
            if(i!=0)
                temp+=str[i]+"."; 
            else
                temp+=str[i];
        }
        return temp;
    }
	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
			String s = in.nextLine();
			System.out.println( reverseWords(s));
			in.close();
		}
	}
	

}

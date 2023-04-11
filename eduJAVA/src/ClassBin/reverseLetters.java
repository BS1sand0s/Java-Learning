package ClassBin;

public class reverseLetters {
	public static void main(String[] args) {
		String s[] = "We are Learning Java".split(" "); 
		String ans = ""; 
		for (int i = s.length - 1; i >= 0; i--) {
		  ans += s[i] + " ";
		}
		
		System.out.println(ans);
	}
}

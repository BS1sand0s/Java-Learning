package ClassBin;
import java.util.Scanner;

public class Interview {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int input[]= {0,0,0,0,0,0,0,0,0,0};
		int j=0;
		int k=0;
		System.out.println("enter 10 numbers");
		for(int i=0;i<10;i++) {
			int numbers= scanner.nextInt();
			k=0;
			for(;k<j;k++) {
				if(input[k]==numbers) {
				break;
				
				}
			}if(j==k) {
				input[j]=numbers;
				j++;
			}
			
		}
		System.out.println("Output of unique values.");
		for(;j>0;j--) {
			System.out.print(input[j-1]+" ,");
		}
		
	}
}

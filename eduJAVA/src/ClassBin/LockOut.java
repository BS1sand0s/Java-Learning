package ClassBin;
import java.util.Scanner;


public class LockOut {
	private static final int MAX_ATTEMPTS = 3;
	
	
	static class AttemptsExceeded extends Exception {
	    public AttemptsExceeded(String message) {
	        super(message);
	    }
	}

	public static void main(String[] args) {
   		 Scanner scanner = new Scanner(System.in);
   		 int attempts = 0;
   		 int expectedPin = 1234;
   		 try {
   		 while (attempts < MAX_ATTEMPTS) {
   		     System.out.print("Enter your PIN: ");
   		     int enteredPin = scanner.nextInt();
   		     if (enteredPin == expectedPin) {
   		         System.out.println("PIN accepted");
   		         break;
   		     } else {
           		 attempts++;
           		 if (attempts == MAX_ATTEMPTS) {
           		     throw new AttemptsExceeded("Maximum number of attempts exceeded");
           		 } else {
           		     System.out.println("Invalid PIN, please try again");
           		 }
        }
    }
   		 }catch(AttemptsExceeded a){
   			 System.out.println("Retry another time!");
   			 
   		 }
}


}
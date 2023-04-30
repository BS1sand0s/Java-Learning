package ClassBin;
import java.util.concurrent.TimeUnit;

public class Experiment {
	public static void main(String[] args) throws InterruptedException {
	System.out.print("Check");
	TimeUnit.SECONDS.sleep(1); // Clear the console
	for(int i = 0; i < 80*300; i++) // Default Height of cmd is 300 and Default width is 80
	    System.out.print("\b"); // Prints a backspace
	System.out.print('\u000C');
    System.out.println("Select an option:");
    
	}
	

}

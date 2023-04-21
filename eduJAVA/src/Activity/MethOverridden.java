package Activity;

class Books{
	//defining a method
	void run()
	{
	System.out.println("Book not in stock");
	}
	}
public class MethOverridden extends Books{
		void run()
		{
		System.out.println("Book is available");
		}
		public static void main(String[] args) {
		MethOverridden obj = new MethOverridden(); //creating object
		obj.run(); //calling method
		}
}

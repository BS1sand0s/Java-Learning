package Activity;

public class TCF {
	public static void main(String[] args) {
		try
		{
		
		int[] numbers = {1, 2, 3};
		System.out.println(numbers[50]);
		}
		catch (Exception e)
		{
		}
		finally
		{
		}
		System.out.println("Some Error in code.");
		System.out.println("The finally statement lets you execute code, after try...catch, "
		+ "regardless of the result");
		}

}

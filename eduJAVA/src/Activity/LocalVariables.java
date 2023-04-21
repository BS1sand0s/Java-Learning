package Activity;

public class LocalVariables {
	public void StudentAge()
	{
	// Local variable
	int age = 0;
	age = age + 30;
	System.out.println("Student age is : " + age);
	}
	public static void main(String[] args) {
	//Local Variable
		LocalVariables temp = new LocalVariables();
	temp.StudentAge();
	}
	}

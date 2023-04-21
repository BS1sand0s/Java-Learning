package Activity;

public class defaltNoArg {
	int i;
	defaltNoArg()
	{
	i=10;
	System.out.println("Creating a No Argument constructor");
	System.out.println("i = " + i);
	}
	public static void main(String[] args) {
	@SuppressWarnings("unused")
	defaltNoArg skil = new defaltNoArg();
	}
}

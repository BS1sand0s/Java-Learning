package Activity;

public class MethOD1 {
	void sum(int a,double b)
	{
	System.out.println(a+b);
	}
	void sum(double b,int a)
	{
	System.out.println(a-b);
	}
	public static void main(String[] args) {
	MethOD1 obj=new MethOD1();
	obj.sum(50,50.0);
	obj.sum(50.0,50);
	}
}

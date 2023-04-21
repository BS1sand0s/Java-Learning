package Activity;

interface A
{
public void A();
}
interface B extends A
{
public void B();
}
interface C extends A
{
public void C();
}
public class HybridIn implements B, C{
public void A()
{
System.out.println("Inside A");
}
public void B()
{
System.out.println("Inside B");
}
public void C()
{
System.out.println("Inside C");
}
public static void main(String[] args) {

HybridIn obj1= new HybridIn();
obj1.A(); obj1.B(); obj1.C();
}
}
package Activity;

interface CBA
{
public void print_CBA();
}
interface ZYX
{
public void print_ZYX();
}
interface RPQ extends CBA, ZYX
{
public void print_RPQ();
}
class child implements RPQ{
public void print_CBA()
{
System.out.println("Cooking");
}
public void print_ZYX()
{
System.out.println("Emerging Technology");
}
public void print_RPQ()
{
System.out.println("IoT");
}
}

public class multiLvlIn{
public static void main(String[] args) {
child d = new child();
d.print_CBA();
d.print_ZYX();
d.print_RPQ();
}
}
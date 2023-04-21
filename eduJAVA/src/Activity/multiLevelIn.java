package Activity;

class BCA
{
public void print_BCA()
{
System.out.println("Cooking");
}
}
class YZX extends BCA
{
public void print_YZX()
{
System.out.println("Emerging Technology");
}
}
class PQR extends YZX
{
public void print_PQR()
{
System.out.println("IoT");
}
}
public class multiLevelIn{
public static void main(String[] args) {
PQR d = new PQR();
d.print_BCA();
d.print_YZX();
d.print_PQR();
}
}
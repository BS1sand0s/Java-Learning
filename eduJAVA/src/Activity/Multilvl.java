package Activity;
class CAB
{
public void print_CAB()
{
System.out.println("Cooking");
}
}
class ZXY extends CAB
{
public void print_ZXY()
{
System.out.println("Emerging Technology");
}
}
class QRP extends CAB
{
public void print_QRP()
{
System.out.println("IoT");
}
}
public class Multilvl{
public static void main(String[] args) {
QRP d = new QRP();
d.print_CAB();
ZXY f = new ZXY();
f.print_ZXY();
}
}
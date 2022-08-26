import java.util.*;

class rectangle1
{
int length, breadth;
void accept()
{
Scanner t = new Scanner(System.in);
System.out.println("Enter length and breadth ");
length = t.nextInt();
breadth = t.nextInt();
}
void area()
{
int a;
a = length * breadth;
System.out.println("Area of rectangle is " +a);
}
}
class rectangle 
{
public static void main(String args[])
{
rectangle1 r1 = new rectangle1();
rectangle1 r2 = new rectangle1();

r1.accept();
r1.area();
r2.accept();
r2.area();
}
}

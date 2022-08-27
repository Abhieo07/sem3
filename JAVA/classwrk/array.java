import java.util.*;
class array
{
	public static void main(String args[])
	{
		Scanner t = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = t.nextInt();
		int a[] = new int[n];
		int i;
		for(i = 0; i < a.length; i++)
			{
				System.out.println("Enter number: ");
				a[i] = t.nextInt();
			}
		int b[] = new int[a.length];
		for(i = 0; i < n; i++)
			{
				b[i] = a[i];
			}
		System.out.println("Copied Array: ");
		for(i = 0; i < n; i++)
			{
				System.out.print("\t"+b[i]);
			}
	}
}
import java.io.*;
import java.util.*;
public class impot {

	public static void main(String[] args) {
		int m;
		int a;
		boolean f;
		Scanner sc=new Scanner(System.in);
		PrintStream myout=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.println("Enter Standards 1.Standard materials 2.Above standard 3.High standard 4.high standard and fully automated");
		m=sc.nextInt();
		myout.println("Enter area");
		a=sc.nextInt();
		myout.println("Enter automated or not");
		f=sc.nextBoolean();
		House1 ob=new House1(m,a,f);
		myout.println("Cost is"
				+ ""+" "+ob.calculateConstructionCost());
		

	}
}

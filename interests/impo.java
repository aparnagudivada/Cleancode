package interests;
import java.io.*;
import java.util.*;
public class impo {

	public static void main(String args[]) {
		float p,t,r;
		
		Scanner sc=new Scanner(System.in);

	    p=sc.nextFloat();
		t=sc.nextFloat();
		r=sc.nextFloat();
		SimpleandCompound ob=new SimpleandCompound( p,t,r);
		PrintStream myout=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.println("Simple Interest is"+" "+ob.sim());
		myout.println("Compound Interest is"+" "+ob.comp());
		

	}

}


import java.util.*;
import java.io.*;
public class calc
{
	int a,b;
	Scanner n = new Scanner(System.in);
	void read()
	{
		System.out.println("enter v1:");
		a=n.nextInt();
		System.out.println("enter v2:");
		b=n.nextInt();
	}
	void add()
	{
		read();
		System.out.println("sum="+(a+b));
	}
	void sub()
	{
		read();
		System.out.println("sub="+(a-b));
	}
	void mul()
	{
		read();
		System.out.println("product="+(a*b));
	}
	void div()
	{
		read();
		System.out.println("div="+(a/b));
	}
	
	public static void main(String[] args)throws IOException {

		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
calc r=new calc();		
for(;;)
{
	System.out.println("\n 1: Addition\r\n 2: Subtraction\r\n3: Multiplication\r\n 4: Division\r\n5: Exit");
    System.out.println("enter choice:-");
    int ch=s.nextInt();
    switch(ch)
    {
    case 1: 
    r.add();
               break;
    case 2:
    	r.sub();
    break;
    case 3:
    	r.mul();
    	    break;
    case 4:	r.div();
    break;
    case 5:System.exit(0); 
    }
	
}
}
}

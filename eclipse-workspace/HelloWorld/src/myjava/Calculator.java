package myjava;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Calculator App");
		
		System.out.print("Select the operation you want to perform: ");
		
		char ch= sc.next().charAt(0);
		int val1,val2,res;
		
		if(ch=='+'|| ch=='-'|| ch == '%' || ch=='*')
		{
			System.out.println("You choose to perform : "+ ch);
		}
		else
		{
			System.out.print("selected operation is invalid");
			
		}
		System.exit(0);
		
		System.out.print(" Enter the first value: ");
		
		val1=sc.nextInt();
		
		System.out.print(" Enter the second value: ");
		
		val2=sc.nextInt();
		
		System.out.print(" The result is : ");
		
		if(ch=='+')
		{
			res= val1+val2;
			
			System.out.println("Here is the output: "+res);
		}
		else if(ch=='-')
		{
			res=val1-val2;
			System.out.println("Here is the output: "+res);
		}
		else if(ch=='%')
		{
			res=val1%val2;
			System.out.println("Here is the output: "+res);
		}
		else
		{
			res=val1*val2;
			System.out.println("Here is the output: "+res);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}

package myjava;
import java.util.*;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //Scanner class used to accepts values from keyboard
		
		
		System.out.print("Enter the number on to the console : ");
		
		int input=sc.nextInt();
		
		
		System.out.println("The entered value is :"+ input);
		
		sc.close();

	}

}

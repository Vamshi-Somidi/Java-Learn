package myjava;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pascalTriangle(5);
		pattern30(4);

	}
	
	static void pascalTriangle(int n)
	{
		for(int row=1;row<=n;row++)
		{
			int noOfSpaces=n-row;
			
			for(int space=1;space<=noOfSpaces;space++)
			{
				System.out.print(" ");
			}
			int C = 1; //to
			
			for(int col=1;col<=row;col++)
			{
				System.out.print(C+" "); 
				C=C*(row-col)/col;
			}
			System.out.println();
			
		}
	}
	static void pattern30(int n)
	{
		for(int row=1;row<=2*n-1;row++)
		{
			
			int c=row>n?2*n-row:row;
			int noOfSpaces=n-row;
			for(int space=1;space<=n-c;space++)
			{
				System.out.print("  ");
			}
			
			for(int col=c;col>=1;col--)
			{
				System.out.print(col+" ");
				
			}
			for(int col=2;col<=c;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}

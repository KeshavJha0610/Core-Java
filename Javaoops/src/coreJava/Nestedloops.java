package coreJava;

public class Nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//nested loops works
		
		for(int i=1;i<=4;i++)//(outer for loop) this block will loop for 4 times
		{
			System.out.println("outer loop started");
			for(int j=1;j<=4;j++)//inner loop
			{
				System.out.println("inner loop");
			}
			System.out.println("outer loop finished");
		}
	}

}

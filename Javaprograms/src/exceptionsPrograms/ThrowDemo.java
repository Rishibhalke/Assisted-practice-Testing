package exceptionsPrograms;

import java.util.InputMismatchException;

public class ThrowDemo {
	
	public void div(int a, int b)
	{
		if(b==0)
		{
			throw new InputMismatchException();
		}
		else {
		int c =a/b;
		System.out.println("the division of 2 number is : " + c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowDemo obj =new ThrowDemo();
		obj.div(12, 0);

	}

}
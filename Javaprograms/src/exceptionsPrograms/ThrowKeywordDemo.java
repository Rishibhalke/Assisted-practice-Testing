package exceptionsPrograms;

public class ThrowKeywordDemo {
	
	public void div(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else {
			int c=a/b;
			System.out.println("the dividon of 2 number is :" + c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowKeywordDemo obj =new ThrowKeywordDemo();
		obj.div(12,0);

	}

}

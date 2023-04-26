
public class Calculator {
	


	public void add(int val1,int val2)
	{
		int result = val1+val2;
		System.out.println("Addition of "+val1+" and "+val2+" is " +result);
		
	}
	public void sub(int val1,int val2) {
		int result = val1-val2;
		System.out.println("Subtraction of "+val1+" and "+val2+" is "+result);
	}
	public void div(int val1,int val2) {
		int result = val1/val2;
		System.out.println("division of "+val1+" and "+val2+" is "+ result);
	}
	
	public void multiply(int val1,int val2) {
		int result = val1*val2;
		System.out.println("multiplication of "+val1+" and "+val2+" is "+ result);
	}
	
	public void sqr(int val1,int val2) {
		System.out.println("square of "+val1+" is "+ val1*val1);
		System.out.println("square of "+val2+" is "+ val2*val2);
		
	}
	public void cube(int val1,int val2) {
		System.out.println("cube of "+val1+" is "+ val1*val1*val1);
		System.out.println("cube of "+val2+" is "+ val2*val2*val2);
		
	}
}

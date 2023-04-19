
public class Calculator {
	
	static int val1=10;
	static int val2=20;
	static int result;
	public static void main(String[] args) {
		add( val1, val2);
		sub(val1,val2);
		div(val1,val2);
		sqr(val1);
		cube(val1);
	}

	public static void add(int val1,int val2)
	{
		result = val1+val2;
		System.out.println("Addition of "+val1+" and "+val2+" is " +result);
		
	}
	public static void sub(int val1,int val2) {
		result = val1-val2;
		System.out.println("Subtraction of "+val1+" and "+val2+" is "+result);
	}
	public static void div(int val1,int val2) {
		result = val1/val2;
		System.out.println("division of "+val1+" and "+val2+" is "+ result);
	}
	public static void sqr(int val1) {
		System.out.println("square of "+val1+" is "+ val1*val1);
		
	}
	public static void cube(int val1) {
		System.out.println("cube of "+val1+" is "+ val1*val1*val1);
		
	}
}

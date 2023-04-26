import java.io.IOException;

public class CalculatorEntry {

	public static void main(String[] args) throws IOException {
		
		CalculatorMenu M = new CalculatorMenu();
		int input = M.show();
		
		System.out.println("Please Enter First number");
		int val1 = CalculatorInput.readInteger();
		
		System.out.println("Please Enter Second number");
		int val2 =CalculatorInput.readInteger();
		
		Calculator c = new Calculator();
		
		switch(input){
			
			case 1 : c.add(val1,val2);break;
			case 2 : c.sub(val1,val2);break;
			case 3 : c.multiply(val1, val2);break;
			case 4 : c.div(val1, val2);break;
			case 5 : c.sqr(val1,val2);break;
			case 6 : c.cube(val1, val2);break;
		}


	}

}

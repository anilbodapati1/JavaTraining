import java.io.IOException;

public class CalculatorMenu {

	public static void main(String[] args) {
	}

		public int show() throws IOException {
			System.out.println("Please select the operation from menu");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Square");
			System.out.println("6. Cube");
			int input = CalculatorInput.readInteger();
			return input;
		}


}

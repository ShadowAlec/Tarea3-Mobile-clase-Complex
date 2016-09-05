package Main;
import Complex.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Complex Number1 = new Complex(3.0,4.3);
	Complex Number2 = new Complex(4.5,7.8);
	Complex ResultSum = new Complex(); 
	Complex ResultSubtraction = new Complex();
	Complex ResultMultiplication = new Complex(); 
	
	ResultSum.sum(Number1,Number2);
	ResultSubtraction.subtraction(Number1,Number2);
	ResultMultiplication.multiplication(Number1, Number2);
	
	ResultSum.print();
	ResultSubtraction.print();
	ResultMultiplication.print();
	
	}

}

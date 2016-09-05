package Complex;

public class Complex {
	
	private double Real, Imaginary;
	
	public Complex(double rl,double Ima)
	{
		setReal(rl);
		setImaginary(Ima); 
	}
	public Complex() {
		// TODO Auto-generated constructor stub
	}
	public double getReal() {
		return Real;
	}
	public void setReal(double real) {
		Real = real;
		return;
	}
	public double getImaginary() {
		return Imaginary;
	}
	public void setImaginary(double imaginary) {
		Imaginary = imaginary;
		return;
	}
	
	public void sum(Complex first,Complex second)
	{
		setReal(first.getReal() + second.getReal());
		setImaginary(first.getImaginary() + second.getImaginary());
		return;
	}
	
	public void subtraction(Complex first,Complex second)
	{
		setReal(first.getReal() - second.getReal());
		setImaginary(first.getImaginary() - second.getImaginary());
		return;
	}
	
	public void multiplication(Complex first,Complex second)
	{
		setReal(first.getReal()*second.getReal() - first.getImaginary()*second.getImaginary());
		setImaginary(first.getImaginary()*second.getReal() + first.getReal()*second.getImaginary());
		return;
	}
	
	public void print()
	{
		System.out.println(getReal()+"+"+getImaginary()+"i\n");
		return;
		
	}
	

}

package in.ineuron.bean;

public class Calculator {
	static {
		System.out.println("Calculator.class file is loading...");
	}

	public Calculator() {
		System.out.println("Calculator class object is created...");
	}

	public int squareIt(int x) {
		return x * x;
	}
}

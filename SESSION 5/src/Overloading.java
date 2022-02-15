public class Overloading {
	static void add(int num1,int num2) {
		int sum = num1+ num2;
		System.out.println("sum of 2 numbers  is: " + sum);
	}
	
	//Duplicated method-> even if the names of the inputs/arguments are changed
	//even return type will not be of use to make the method unique
//	static void add(int n, int n2) {
//		int sum = n1+n2;
//		return sum;
//	}
	
	//Duplication of method is allowed only if we have unique inupts/arguments
	static void add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Sum of 3 numbers is: " +sum);
	}
	
	static void add(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("Sum of 2 numbers(double) is: " +sum);
	}
	
	static void add(double num1, int num2) {
		double sum = num1 + num2;
		System.out.println("Sum of 2 numbers(double and int) is: " +sum);
	}
	
	static void add(int num1, double num2) {
		double sum = num1 + num2;
		System.out.println("Sum of 2 numbers(int and double) is: " +sum);
	}
	//compile time polymerphism
	//>>oveloading
	
	//RULES TO OVERLOAD
	//1. Name must be same
	//2.inputs must be unique
	//    2.1 number of inputs
	//    2.2 types of input
	//    2.3 sequence of inputs
	//return type has no role to play
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10.22,20.30);
		add(10,20.2);
		add(2.2,33);
		
	}

}

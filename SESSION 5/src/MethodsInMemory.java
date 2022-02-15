
public class MethodsInMemory {
	
	void squareOfNumber(int number) {
		System.out.println("Number before is: "+number);
		number = number*number;
		System.out.println("number after is: "+number);
	}

	public static void main(String[] args) {
		MethodsInMemory refVar = new MethodsInMemory();
		int data = 11;
		System.out.println("Data is: " +data);
		refVar.squareOfNumber(data);
		System.out.println("data after is: "+ data); 

	}

}

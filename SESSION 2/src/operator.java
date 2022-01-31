/*
 Model
 
 View
 
 Controller
    	Logical operations
    	 1.Operator for computations
    	 2.If/else and switch case for decision making 
    	 3. loops for iterations
    	 
    	 ps: for controller , model will be data provider
 */
public class operator {

	public static void main(String[] args) {
		//1. Arithematic operators
		// +,-,*,/,%
		
		double amount = 3565.55;
		double tax = 0.18;
		double total = amount + (tax*amount);
		System.out.println("Total to pay:" + total);
		
		int  number = 10;
		int buckets = 3;
		int hashCode = number % buckets;
		System.out.println("Hashcode for number " +number + "with bucket size of " +buckets+" is "+hashCode);
		
		//2. Assignment operator
		// =,+,-,*,/,%
		int eWallet = 500; //assign operator to assign the value
		int myWaller = eWallet; // value copy operation
		
		eWallet = eWallet + 100;
		System.out.println("eWallet now is " +eWallet);
		
		eWallet %= 7; 
		System.out.println("eWallet is now: "+eWallet);
		
		//3. Increment and Decrement operators
		// ++ and --
		
		
		int quantity = 1;
		quantity++;
		++quantity;
		++quantity;
		
		quantity--;
		
		System.out.println("quantity is: " +quantity );
		
		//int value = quantity++; //copy the value first and update quantity later i.e. the last copy of data
		int value = ++quantity; //update quantity and copy the data into value i.e. the latest data
		System.out.println("Value is:"+value);
		System.out.println("quantity is: " +quantity);
		
		//4. Conditional or Relational
		// >, <, <= ,>=,==,!=
		
		int cabFare = 300;
		System.out.println("can i book cab? " +(eWallet >=cabFare));
		

	}

}

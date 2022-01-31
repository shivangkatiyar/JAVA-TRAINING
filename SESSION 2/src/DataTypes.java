public class DataTypes {
	//main method
	//from where the execution begins
	public static void main(String[] args) {
		//Creational statement -> Create a storage container named as age | age(variable)
		// Store the data 35 in it | 35(literal)
		// byte is the type of storage container which means allocate the size of 8 bits
		byte age = 35; //0000 0100
		// age is 8 bits (stack) while 35 is 32 bits (constant pool)
		
		//read statement
		System.out.println("1. age is:" +age);
		
		//update statement
		age = 40;
		System.out.println("2. age is:"+age);
		// 8 bits-> 2 power 8 | 256 | 256/2 => -123 to 0 to 127
		// age = 128 // error :(
		
		//down casting
		//literal of size 32 bits is copied into 8 bits
		// it is taken case by compiler automaticity -> Implicit down casting
		
		// we can do it ourself as well
		
		age = (byte)256;
		System.out.println("3. age is:" +age);
		
		short s = 120; // short is 16 bits
		int eWallet = 300; //int is 32 bits
		long phoneNumber = 9090910101L; // 9090910101L-> 64 bit literal memory
		
		//upcasting
		//here 32 bits are copied into 64 bits
		long data = 200;  // 200 -> 32 bits
		
		//downcasting
		//here 64 bits are copied into 32 bits 
		//we will get error in downcasting -> add a manual cast
		//but this can be a problem -> as we may loose the data
		int number = (int)data;
		
		//floating point 
		//float percentage = 75.7; // percentage -> 32 bits | 75.7 -> 64 bits
		float percentage = 75.7F; // percentage -> 32 bits  75.7 -> 32 bits
		double discount = 0.25; // discount -> 64 bits | 0.25 64 bits
		
		//down casting
		float pi = (float)3.14;
		//up casting
		double piAgain = pi;
		
		
		char ch = 65; // ASCII code
		ch = 'A';  // store the character directly in single quotes
		ch = '\u20b9';
		System.out.println("ch is:" +ch);
		
		boolean internet = true;
		internet = false;
		
		//primitive cannot sotre data as multiple values 
		//eg: we cannot put lot of data in the same container
		// int number = 10, 20, 30, // error
		// char ch = 'ABCD'  //error
	}
}

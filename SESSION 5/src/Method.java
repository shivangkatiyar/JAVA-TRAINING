public class Method {
	//Function inside a class is called Method
	//Method can of 2 types
	  //1-> Non static => it is executed with reference variable
	  //2->Static => it is executed with class name
	
	//return type -> any data type i.e. primitive or reference type
	//				all in all only 1 single return can be done
	// 				return marks the end of the method
	// name -> any meaningful name
	// java follows camel case -> method name should be like startsLowerAnsThanGoesUpper
	
	//Arguments or input  list -> multiple inputs / arguments as per our requirement
	
	// Definition -> what method will do, piece of logic goes here
	// Execution -> from the main or any other method -> alongwith static/non static conventions
	
	static int f(int x, int y) {
		return x*x +y*y + 2*x*y;
	}
	
	public static void main(String[] args) {
		//for non static function
		//Method refVar = new Method();
		//int result =refVar.f(10,20);
		
		//for static method
		//int result = Method.f(10,20);
		// if f is marked as static and belongs to the same class, where main also resides then we can also directly execute is
		int result = f(10,20);
		System.out.println(result);
		
	}
}

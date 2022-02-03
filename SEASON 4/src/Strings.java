//String is a class in java.lang package
//java.lang package is the default package in java, which we need not to import
//import java.lang.String; // this is not required
public class Strings {
	public static void main(String[] args) {
		char ch = 'J';
		
		//Interned String-> refers directly to the literal
		String name1 = "John watson";
		
		//Object String ->String is created inside the Heap with data
		String name2 = new String("Fionna Flynn");
		
		//String is a class in java i.e. why S is in upper case
		//Since String reference variable are storing haschCode
		//And also , they are multi value container as they store more than 1 character
		// We call string as reference data type or a multi value container
		
		//Whenever we print reference variable , get to see the data instead of hashcode
		System.out.println("name1 is: " +name1);
		System.out.println("name2 is: "+name2);
		
		//What's the magic behind us not able to see HashCode from reference variables 
		//is teh toString method
		//toString method will be automatically executed by the compiler, when print reference variables
		
		System.out.println("name1.toString() is : "+name1.toString());
		System.out.println("name2.toString() is: "+name2.toString());
		
		//toString is the one which returns the String textual content rather than hashCode :)
		
		
	}

}

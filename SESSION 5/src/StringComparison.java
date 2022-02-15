
public class StringComparison {

	public static void main(String[] args) {
		
		//Interned Strings
		// these are stored in string pool
		String s1 = "John";
		String s2 = "John";
		
		//String objects
		//these are stored in heap
		String s3 = new String("John");
		String s4 = new String("John");
		
		//  == operator compares the references and not the value
		//hence we can use == to compare only interned string
		if(s1==s2) {
			System.out.println("1. s1 == s2");
		}
		else {
			System.out.println("1. s1 != s2");
		}
		
		if(s3==s4) {
			System.out.println("2. s3 == s4");
		}
		else {
			System.out.println("2. s3 != s4");
		}
		
		if(s2==s4) {
			System.out.println("3. s2 == s4");
		}
		else {
			System.out.println("3. s2 != s4");
		}
		
		//equals compare content
		if(s3.equals(s4)) {
			System.out.println("4. s3 equals s4");
		}
		else {
			System.out.println("4. s3 not equals s4");
		}
		
		if(s2.equals(s4)) {
			System.out.println("5. s2 equals s4");
		}
		else {
			System.out.println("5. s2 not equals s4");
		}
		
		
		if(s3.compareTo(s4) == 0) {
			System.out.println("6. s3 compared to s4");
		}
		else {
			System.out.println("6. s3 not compared to s4");
		}
		
		//compare by ignoring the cases(Uppercas e or lowercase)
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println("7. s3 equalsIgnoreCase s4");
		}
		else {
			System.out.println("7. s3 not equalsIgnoreCase s4");
		}
		
		if(s3.compareToIgnoreCase(s4)== 0) {
			System.out.println("8. s3 compareToIgnoreCase s4");
		}
		else {
			System.out.println("8. s3  not compareToIgnoreCase s4");
		}
	}

}

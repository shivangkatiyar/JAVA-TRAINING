
public class ImmutablePropertyOfString {

	public static void main(String[] args) {
		//Strings are immutable
		// we cannot change the string, once is is created in the memory
		String quote = "be exceptional";
		System.out.println("quote is: " +quote);
		
		//whenever a string manipulation is done 
		// old string is not modified
		// we will get new string in the memory
		
		String upperCaseQuote = quote.toUpperCase();
		System.out.println("uppercasequote  now is: "+upperCaseQuote);
		
		//here we are updating the reference variable to refer to the new upper case string
		//hence, the old lower case string wil go dangling
		//i.e. string literal resides in the memory with no reference variable referring to it
		//quote = quote.toUpperCase(); -> this is not a good practice as per above explanation
		
		String names = " john , jennie , jim, jack, joe";
		System.out.println("names is: "+names);
		String replaceNames = names.replace('j', 'k');
		System.out.println("names now is: " +replaceNames);
	}

}

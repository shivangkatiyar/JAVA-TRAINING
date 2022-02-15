
public class StringBuiltinMethods {

	public static void main(String[] args) {
		String names = "john,jennie,jim,jack,joe";
		int idx = names.indexOf('o');
		System.out.println("index of o is "+idx);
		
		idx = names.lastIndexOf('o');
		System.out.println("index of o from the last is: "+idx);
		
		int length = names.length();
		System.out.println("length of names is: "+length);
		
		//Strings are indexed from 0 to n-1 where n is length of string
		
		char ch = names.charAt(1);
		System.out.println("ch is:" +ch);
		
		ch = names.charAt(length-1);
		System.out.println("ch is: "+ch); 
		
		idx = names.indexOf("jim"); //index of jim j is
		System.out.println("index of jim is: "+ idx);
		
		String subString = names.substring(idx); //substring from idx till end
		System.out.println("substring is: "+subString);
		
		String name = names.substring(idx,17); // substring from idx till 16 that is less than 17
		System.out.println("name is:"+name);
		
		
		String[] strArr = names.split(",");
		for(String str:strArr) {
			System.out.println(str.trim());
		}
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".")) {
			System.out.println("valid email");
		}
		else {
			System.out.println("invalid email");
		}
		
		String googleEmail = "john@gmail.com";
		if(googleEmail.endsWith("gmail.com")) {
			System.out.println("its a valid gmail");
		}
		else {
			System.out.println("invalid gmail");
		}

	}

}

public class ArraysSyntaxes {
	public static void main(String[] args) {
		//1d arrays-> We can store multiple values in a container
		
		//Syntax1 -> here new int[] is taken care by compiler
		int[] array1 = {10,20,30,40,50};
		//Syntax2
		int[] array2 = {10,20,30,40,50};
		
		System.out.println("array1:" +array1);
		System.out.println("array2: "+array2);
		
		//Syntax 1 and Syntax2 are implicit syntaxes
		
		//Syntax
		//Syntax 3 is Explicit syntax
		int[] array3 = new int[]{10,20,30,40,50};
		System.out.println("array3 is: "+array3);
		
		
		//when we don't know the elements for array, initialize with size
		//Syntax 4
		//create the array with the size and hence, all the elements will be of default 0
		int array4[] = new int[5];
		System.out.println("array4 is: "+array4);
		
		//Bracket before and bracket after is for declaration
		int a1[],a2;
		a1 = new int[10];  //a1 can refer an array
		a2 = 256; // a2 is a primitive integer
		
		int[] a3, a4; // both will be reference variable to array
		a3 = new int[5]; //a1 will refer to array
		a4 = new int[10]; //a2 will refer to array
		
		
		
		//deletion happens automatically when we exit the main method for the containers
		//But, for the cleaning of Heap memory we have a program which runs after a certain interval of time again and again
		//Garbage Collector [Program in JVM] -> removes unused objects from the Heap area
		//GC works automatically. But in some scenarios when you feel your program is going extensive on memory 
		//Then we can also execute GC
		//System.gc(); //Explicit request to GC to run and collect the unused objects and delete tham
		
		
	}

}

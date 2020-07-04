package BasicJava;

import java.util.ArrayList;

public class ArrayListConcept {
	
	//Array is a special variable which will store different/multiple data of similar type
	//two major dis-advantage
	//1.only similar type of data:to to resolve this problem we use Object array.
	//2.size are fixed:static array:to overcome this problem we use dynamic array-ArrayList
			
			
	//ArrayList --Dynamic Array
	//is a default class
	//Special class of java ArrayList
	//index base,maintain the oreder
	// memory will crete, default size Arraylist=10

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList(); 
		System.out.println(ar.size());
		
		ar.add(100); //index 0
		ar.add(200); //index 1
		System.out.println(ar.size());
		
		
		ar.add(300); //index 2
		ar.add(400); //index 3
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		
		ar.add(500); //index 4
		ar.add(600); //index 5
		
		System.out.println(ar.size());
		
		//ar.remove(5);  //if we want remove any index value;
		
		//System.out.println(ar.get(4)); //IndexOutOfBoundsException
		
		//print all the value from ArrayList: use for loop;
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i)); //never write <=;
		}
		//RAW TYPE( NON GENERICE)
		ar.add(10.99);
		ar.add("Java");
		ar.add('m');
		
		//Integer ArrayList: Generic
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		//ar.add("java");
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Java");
		ar2.add("Selenium");
		//ar2.add(100); //Integer value not allow
		
	}

}

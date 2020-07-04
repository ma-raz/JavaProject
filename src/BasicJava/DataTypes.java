package BasicJava;

public class DataTypes {
	//Data Types:Different sizes and values can be stored in a variable
	// 1.Primitive:byte,short,int,long,float,double,boolean=1 bit,char
	//2.Non-primitive:Are called reference types because they refer to objects.String,Array,Classes
	//In java everything is Object except primitive data types.
	
	public static void main(String[] args){
	
	//1.int=4 bytes=32 bits. 1 byte=8 bits
	//int:dublicate value not allow but we can resize the value.
		int i=10;
		int j=20;
		System.out.println(i);
		System.out.println(i+j);
		
	//2.byte=1 byte :Range:-128 to+127
		byte i1=20;
		
	//3.short=2 bytes:Range -32768 to 32767
		
	//4.long=8bytes
		long l1=120000;
		
	//5.double=8bytes
		double d1=12.39394995;
		double d2=12.33;
		double d3=10;//10.00
		
	//6.float=4bytes
		float f1=1.2f;//for memory savings point of we can use float other than double.
		
	//7.char=2 bytes
		char c1='a';
		char c2='1';
		char c3='$';
			
	//8.boolean=true/false
		boolean b1=true;
		boolean b2=false;
		
	//9.String : Is not a data type, it's a class. it can be use store String value
		String s="Java Selenium";
		String s1="This is my java class";
		String s2="1000";
		String s3="12.55";
		String s4="A";
		
		System.out.println("Data types are very important in Java");

		

	}

}

package BasicJava;

public class IfElse {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(a==b) {
			System.out.println("both are equal");
		}else
		{
			System.out.println("both are not equal" );
		}
		
		if(b>a) {
			System.out.println("b is greater than a");
		}else {
			System.out.println("a is greather than b");
		}
		
		//> >= == =!
		String s1="Hello";
		String s2="hello";
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}else {
			System.out.println("not equal");
		}
		
		if(true) {
			System.out.println("PASS");
		} else { //dead code, if if true never come to else
			System.out.println("FAIL");
		}
		
		if(10==10)
			System.out.println("pass");
		
		
	//write a program to find out max number(given 3 numbers)
		int x=100, y=200, z=300;
		
		if(x>y && x>z) {
			System.out.println("x ix greater");
		}else if (y>z) {
			System.out.println("y is greater");
		}else {
			System.out.println("z is greater");
		}
		
	}
	}



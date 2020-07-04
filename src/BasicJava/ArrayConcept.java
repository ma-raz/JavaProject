package BasicJava;

public class ArrayConcept {

	public static void main(String[] args) {
		//Array is a special variable which will store different/multiple data of similar type
		
		//two major dis-advantage
		//1.only similar type of data:to to resolve this problem we use Object array.
		//2.size are fixed:static array:to overcome this problem we use dynamic array-ArrayList
		
		int[] i=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		
		System.out.println(i[0]+i[1]);
		System.out.println(i.length);
		
		//to print all the values of array:use for loop
		for(int k=0;k<=i.length-1;k++) {
			System.out.println(i[k]);
		}
		
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
	}
	
	

}

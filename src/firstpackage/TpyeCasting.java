package firstpackage;

public class TpyeCasting {

	public static void main(String[] args) {
		
		//implicit type casting
		
		byte b =10;
		int i = b;
		System.out.println(i);
		
		float f =22.5f;
		double d= f;
		System.out.println(d);
		
		char ch = 'A';
		int i2 = ch;
		System.out.println(i2);
		
		char ch2 ='\u00A7';
		int i1 =ch2;
		System.out.println(i1);
		
		//explicit type casting
		
		double f1 = 10.3f;
		int i4 = (int)f1;
		System.out.println(i4);
		
		long l1 = 704271009;
		int i9 = (int)l1;
		System.out.println(i9);
		
		float f2 = 34.56f;
		int i5 = (int)f2;
		System.out.println(i5);

	}

}

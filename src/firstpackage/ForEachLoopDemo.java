package firstpackage;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		for(int i:a)
		{
			System.out.println(i);
		}
		
		char ch[]= {'j','a','v','a'};
		for (char c:ch)
		{
			System.out.println(c);
		}
		System.out.println(" ");
		String s1[]= {"Java","Programming","learning"};
		for(String s:s1)
		{
			System.out.println(s+" ");
		}
		
	}

}

package firstpackage;

class Student {
	   String name;
	   int age;
	   int roll_number;
}

 class S {

	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.name="Ayesha Sultana";
		s1.age=20;
		s1.roll_number=123;
		
		Student s2=new Student();
		s2.name="Sultana";
		s2.age=21;
		s2.roll_number=245;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.roll_number);
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.roll_number);
	}

}

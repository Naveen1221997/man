package oops;

public class mainclass1 
{
	public static void main(String[] args) {
		student s1=new student();
		s1.setName("naveen");
		
		dept d=new dept();
		d.setDeptname("ECE");
		System.out.println(s1.getName());
		System.out.println(d.getDeptname());
		
	}
	

}

package oops;

public class mainclass 
{
	public static void main(String[] args) 
	{
		Battery  b1=new Battery();
		b1.brand="nokia";
		b1.price=1000;
		b1.capacity=5000;
		mobile m1= new mobile();
		m1.brand="nokia";
		m1.price=100;
		m1.battery=b1;
		System.out.println(m1.battery.brand);
	}


}

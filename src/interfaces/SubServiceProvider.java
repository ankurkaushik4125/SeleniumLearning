package interfaces;

public class SubServiceProvider extends ServiceProvider {
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
		
	}
	
	public static void main (String aa[])
	{
		SubServiceProvider s = new SubServiceProvider();
		s.m1();
		s.m2();
	}
}

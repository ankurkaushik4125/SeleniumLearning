package Abstract;

public class AbstractImplementation {
	
	public static void main(String [] aa)
	{
		AbstractMethodExample a1= new AbstractMethodExample() {
			
			@Override
			public int GetnoTyres() {
				// TODO Auto-generated method stub
				return 50;
			}
		};
		
		System.out.println(a1.GetnoTyres());
		
		
	}

}

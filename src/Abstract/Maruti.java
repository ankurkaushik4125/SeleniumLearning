package Abstract;

public class Maruti {
	
	public static void main(String [] aa)
	{
		
		
		Vehicle v1 =new Vehicle() {
			
			@Override
			public int getNoOfWheels() {
				// TODO Auto-generated method stub
				return 50;
			}
		};
		
		System.out.println(v1.getNoOfWheels());
	}

}

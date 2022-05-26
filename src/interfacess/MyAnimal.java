package interfacess;

public class MyAnimal extends Dog {
	public void Tail()
	{
		System.out.println("Long");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MyAnimal ma = new MyAnimal();
		ma.ColorOfAnimal();
		
		int no = ma.Horns();
		
		System.out.println(no);
		
		ma.Tail();
		
		ma.SoundOfAnimal();
		
	}

}

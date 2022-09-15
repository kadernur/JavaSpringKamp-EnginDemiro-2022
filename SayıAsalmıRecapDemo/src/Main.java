
public class Main {

	public static void main(String[] args) {
	
		//asal sayı hesaplama
		
		int number=1;
		int remainder=number%2;

		boolean isPrime=true;
		if(number==1)
		{
			System.out.println("Asal değildir");
			return;
		}
		if(number<1)
		{
			System.out.println("Geçersiz sayı");
		}
	for(int i=2; i<number;i++)
	{
		if(number%i==0)
		{
			isPrime=false;
		}
	}
		
	if(isPrime)
	{
		System.out.println("Sayı asaldır");
	}
	else
	{
		System.out.println("sayı asal değildir.");
	}
	
		
	}
	
	

}

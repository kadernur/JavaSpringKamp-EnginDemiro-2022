
public class DortIslem {

	public int Topla(int sayi1,int sayi2)
	{
		return sayi1+sayi2;
	}
	public int Cıkar(int sayi1,int sayi2)
	{
		return sayi1-sayi2;
	}
	
	public int Carp(int sayi1, int sayi2)
	{
		return sayi1*sayi2;
	}
	
	public int Bol(int sayi1,int sayi2)
	{
		if(sayi2==0)
		{
			System.out.println(" payda sıfır olamaz!!");
			
		}
		
			return sayi1/sayi2;
		
		
	}
}

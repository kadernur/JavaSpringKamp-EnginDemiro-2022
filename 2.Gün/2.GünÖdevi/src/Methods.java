
public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
		
		
		
		
	}
	
	
	//javada method isimleri cemalCase yazılır.
	public static void sayiBulmaca()
	{
		int[]sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=7;
		boolean sayiVarmi=false;
		
		for(int aranan:sayilar)
		{
			if(aranacak==aranan)
			{
				sayiVarmi=true;
				break;
				
			}
			
		}
		if(sayiVarmi)
		{
			mesajVer("sayı mevcut " +aranacak);
		}
		else
		{
			mesajVer("Sayı mevcut değil. " + aranacak);
		}

	}
	//parametreli method
	
	public static void mesajVer( String mesaj)
	{
		System.out.println(mesaj);
	}
}

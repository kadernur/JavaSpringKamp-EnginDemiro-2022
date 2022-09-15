
public class Main {

	public static void main(String[] args) {
		
		int[]sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=8;
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
			System.out.println("sayı mevcut");
		}
		else
		{
			System.out.println("Sayı mevcut değil.");
		}

	}

}

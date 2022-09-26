
public class ArkadasSayilar {

	public static void main(String[] args) {
	// Arkadaş sayılar=kendileri hariç pozitif tam sayı bölenlerinin toplamı birbirine esit olan sayılara denir.
		
		
		int sayi1=221;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1;i<sayi1;i++)
		{
			if(sayi1%i==0)
			{
				toplam1+=i;
			}
		}
		
		for(int i=1;i<sayi2;i++)
		{
			if(sayi2%i==0)
			{
				toplam2+=i;
			}
		}
		
		if(sayi1==toplam2 && sayi2==toplam1)
		{
			System.out.println("Sayılar arkadaştır");
		}
		else
		{
			System.out.println("Bu iki sayı arkadaş değildir.");
		}

	}

}

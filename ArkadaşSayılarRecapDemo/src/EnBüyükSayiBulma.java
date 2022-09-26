
public class EnBüyükSayiBulma {

	public static void main(String[] args) {
		//elimizde olan 3 sayıdan en büyüğünü bulma
		
				int sayi1=20;
				int sayi2=25;
				int sayi3=30;
				
				int enBuyukSayi=sayi1;
				
				if(sayi2>sayi1)
				{
					if(sayi3>sayi2)
					{
						enBuyukSayi=sayi3;
					}
					else
					{
						enBuyukSayi=sayi2;
					}
				}
				
				System.out.println(enBuyukSayi);
				
				
				
	}

}

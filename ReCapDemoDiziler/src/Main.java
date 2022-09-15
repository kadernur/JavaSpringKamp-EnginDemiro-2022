
public class Main {

	public static void main(String[] args) {
		double[]myList= {1.2,1.3,4.3,5.6};
		
		//sayıları tek tek ekrana yazdırma
		for(double number:myList)
		{
			System.out.println(number);
		}
		
		//bu sayıların toplamını ekrana yazdırma
		double toplam=0.0;
		
		//örnek açısından for döngüsünü tekrar yazalım
		
		for(double number:myList)
		{
			toplam+=number;
			
			
		}
		System.out.println("dizi elemanlarının toplamı: " +toplam);
		
		
		//birde en büyük sayıyı bulalım
		
		double max=myList[0];
		
		for(double number:myList)
		{
			if(max<number)
			{
				max=number;
			}
		}
		
		System.out.println("En büyük sayı: " +max);
		
		

	}

}

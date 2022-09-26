
public class MükemmelSayilar {

	public static void main(String[] args) {
		//mükemmel sayı:kendinden başka pozitif tam bölenlerinin sayısının
				//toplamı kendisine esit olan sayılara denir.6=1+2+3
				
				int number=6;
				int toplam=0;
				for(int i=1;i<number;i++)
				{
					if(number%i==0)
					{
						toplam+=i;
					}
				}
				if(toplam==number)
				{
					System.out.println("sayı mükemmel sayıdır.");
				}
				else
				{
					System.out.println("mükemmel sayı değildir.");
				}
				
	}

}

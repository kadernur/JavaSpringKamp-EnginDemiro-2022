
public class Methods2 {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi=topla(5,7);
		System.out.println(sayi);
		 int toplam=topla2(2,3,4,5,7,8);
		 System.out.println(toplam);

	}
	
	//methodları kendimizi tekrar etmemek için kullanırız.
	//DRY Don't repat yourself
	//void operasyonlarda:bir şeyi yapmasını istediğimiz durumlarda kullanılır.
	//return operasyonlarında ise: değer döndürmesinin istediğimiz durumlarda kullanırız.
	

	public static void ekle()
	{
		System.out.println("Eklendi");
	}
	public static int topla( int sayi1,int sayi2)
	{
		return sayi1+sayi2;
	}
	//istenilen sayıda parametre göndermemize olanak sağlayan:Variable arguments.
	public static int topla2(int... sayilar) 
	{
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
		
	}
	public static String sehirVer()
	{
		return "Ankara.";
	}
}

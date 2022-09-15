
public class Main {
	//main javada başlangıç metodudur.

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
		//değişken isimlendirmeleri javada camelCase yazılır.
		
		String ortaMetin = "ilginizi çekebilir";
		String altMetin = "Vade süresi";
		System.out.println(ortaMetin);
		
		int vade=12;
		double dolarDun=18.14;
		double dolarBugün=18.10;
		
	
		boolean dolarDustuMu=false;
		
		String okYonu=" down.svg";
		
		if(dolarDun>dolarBugün)
		{
			System.out.println("Dolardüstü");
			
		}
		else
		{
			System.out.println("Dolar yükseldi.");
			
		}
		
		
		//array
		 String[] krediler= {"Hızlı kredi","öğrenci kredisi"};
		 
		 System.out.println(krediler[0]);
		 
		 for(int i=0;i<krediler.length;i++)
		 {
			 System.out.println(krediler[i]);
		 }
		
		
		
		
		
		
		
		

	}

}

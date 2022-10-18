
package Polimorfizm;

public class CustomerManager {
	
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger logger)
	{
		this.baseLogger=logger;
	}
	
	public void add() {
		System.out.println("Müşteri eklemdi. ");
		this.baseLogger.log("Log mesajı" );
		
	}
	
	

}

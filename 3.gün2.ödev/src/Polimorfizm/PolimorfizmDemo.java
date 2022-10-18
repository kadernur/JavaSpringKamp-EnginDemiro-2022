package Polimorfizm;

public class PolimorfizmDemo {

	public static void main(String[] args) {
//		
//		EmailLogger logger =new EmailLogger();
//		logger.Log("Log mesajı");
		
		BaseLogger[] loggers=new BaseLogger[] {  new EmailLogger(),new FileLogger(), new DatabeseLogger()};
		
	for( BaseLogger logger : loggers)
	{
		logger.log("  =>Log mesajı: " );
	}
	
	CustomerManager customerManager=new CustomerManager(new DatabeseLogger());
	customerManager.add();
		

	}

}

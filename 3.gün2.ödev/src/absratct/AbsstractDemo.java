package absratct;

public class AbsstractDemo {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		customerManager.baseDatabaseManager=new SqlServerDatabaseManager();
		customerManager.getCustomer();
		
		

	}

}

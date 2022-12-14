package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabeseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1=new Product(1,"Iphone Xr",1000);
		Logger[] loggers = {new DatabeseLogger(),new FileLogger()};
		
		ProductManager productManager=new ProductManager(new JdbcProductDao(), loggers);
		
		productManager.add(product1);
		
		
		
		

	}

}

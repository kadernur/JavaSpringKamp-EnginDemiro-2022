package oop1;

public class Main {

	public static void main(String[] args) {

		// Nesne tanımı
		Product product1 = new Product();

		// set value
		;
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setImageUrl("resim.jpg	");	

		// get

		// System.out.println(product1.name);
		// System.out.println(product1.unitPrice);

		Product product2 = new Product();
	
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(6500);
		product2.setImageUrl("resim2.jpg	");
		

		

		Product product3 = new Product();
		
		product3.setName("Kitchen Ait Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setImageUrl("resim3.jpg	");

		
		
		Product[] products= {product1,product2,product3};
		System.out.println("<ul>");
		
		for (Product product : products) {
			System.out.println( "<li>" + product.getName() + "</li>");
			
		}
		
		System.out.println("</ul>");
		
		
		
		İndividualCustomer individualCustomer=new İndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05655866666");
		individualCustomer.setCustomerNumber("1234");
		
		individualCustomer.setFirstName("Kader");
		individualCustomer.setLastName("Tekin");
		
		
		
		
		

		
		
		
		
		
		
		
		

	}

}

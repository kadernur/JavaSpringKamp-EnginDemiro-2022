
public class Main {

	public static void main(String[] args) {
		 int[] sayilar1 = new int[] { 1, 2, 3 };
	        int[] sayilar2 = new int[] { 10, 20, 30 };
	        sayilar1 = sayilar2;
	        sayilar2[0] = 1000;
	        System.out.println(sayilar1[0]);

	        CreditManager creditManager = new Main().new CreditManager();
	        creditManager.Calculate();
	        creditManager.Save();

	        Customer customer = new Main().new Customer();
	        customer.Id = 1;
	        customer.City = "Ankara";
	        CustomerManager customerManager = new Main().new CustomerManager(customer,
	                new Main().new MilitaryCreditManager());
	        customerManager.Save();
	        customerManager.Delete();
	        customerManager.GiveCredit();
	        Company company = new Main().new Company();
	        company.TaxNumber = "100000";
	        company.CompanyName = "Arçelik";
	        company.Id = 100;
	        CustomerManager customerManager2 = new Main().new CustomerManager(new Main().new Person(),
	                new Main().new TeacherCreditManager());
	        customerManager2.GiveCredit();
	        CustomerManager customerManager3 = new Main().new CustomerManager(new Main().new Company(),
	                new Main().new CarCreditManager());
	        customerManager3.GiveCredit();

	        Person person = new Main().new Person();
	        person.FirstName = "Engin";
	        person.LastName = "Demiroğ";
	        person.NationalIdentity = "123456";

	        /*
	         * Customer c1 = new Program().new Customer();
	         * Customer c2 = new Program().new Person();
	         * Customer c3 = new Program().new Company();
	         */

	    }

	    interface ICreditManager {
	        void Calculate();

	        void Save(); // hepsinde aynı olacak gidip tekrar yapma
	    }

	    abstract class BaseCreditManager implements ICreditManager {
	        public abstract void Calculate(); // değişken olduğu için abstract yap

	        public void Save() { // tekrar yapacağına burda yaz ve hepsinde aynı olduğu için abstract metot değil
	            System.out.println("Kaydedildi");
	        }
	    }

	    class TeacherCreditManager extends BaseCreditManager {

	        @Override
	        public void Calculate() {
	            System.out.println("Öğretmen kredisi hesaplandı");

	        }

	        @Override
	        public void Save() {
	            // javada interface metotları zaten virtual'dir
	            // c# taki base olayına gerek yok bunda
	        }

	    }

	    class MilitaryCreditManager extends BaseCreditManager {

	        @Override
	        public void Calculate() {
	            System.out.println("Asker kredisi hesaplandı");

	        }

	        @Override
	        public void Save() {
	            // TODO Auto-generated method stub

	        }
	        // BaseCreditManager zaten ICreditManager'i implement ediyor
	        // O zaman abstract class'ı extend edince aslında o interface'yi de
	        // dolaylı olarak implement etmiş oluyoruz bu derived class'larda
	    }

	    class CarCreditManager extends BaseCreditManager {

	        @Override
	        public void Calculate() {
	            System.out.println("Araba kredisi hesaplandı");

	        }

	        @Override
	        public void Save() {
	            // TODO Auto-generated method stub

	        }

	    }

	    class CreditManager {
	        public void Calculate() {
	            System.out.println("Hesaplandı");
	        }

	        public void Save() {
	            System.out.println("Kredi verildi");
	        }
	    }

	    class Customer {
	        public Customer() {
	            // System.out.println("Müşteri nesnesi çalıştırıldı");
	        }

	        public int Id;
	        public String City;

	        public void Save() {
	            System.out.println("Müşteri kaydedildi");
	        }
	    }

	    class Company extends Customer {
	        public String CompanyName;
	        public String TaxNumber;
	    }

	    class Person extends Customer {
	        public String FirstName;
	        public String LastName;
	        public String NationalIdentity;
	    }

	    class CustomerManager {

	        //private Customer _customer; //kullanmıştık gerek kalmadı
	        ICreditManager _creditManager;

	        public CustomerManager(Customer customer, ICreditManager creditManager) {
	            //_customer = customer; // class'taki her alanda bu customer'i kullanabilelim diye
	            _creditManager = creditManager;
	        }

	        public void Delete() {
	            System.out.println("Müşteri silindi");
	        }

	        public void Save() {
	            System.out.println("Müşteri kaydedildi");
	        }

	        public void GiveCredit() {
	            _creditManager.Calculate();
	            System.out.println("Kredi verildi");
	        }
	    }

	}



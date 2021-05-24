package CoffeShop;



import CoffeShop.adapters.MernisServiceAdapter;
import CoffeShop.business.abstracts.BaseCustomerManager;
import CoffeShop.business.concretes.StarbucksCustomerManager;
import CoffeShop.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer(12345L, "SEYİT", "KÖSE", 1234);
		baseCustomerManager.save(customer);
		
		
		
		
		



	}

}

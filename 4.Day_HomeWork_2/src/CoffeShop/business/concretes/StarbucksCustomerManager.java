package CoffeShop.business.concretes;

import CoffeShop.adapters.CustomersCheckService;
import CoffeShop.business.abstracts.BaseCustomerManager;
import CoffeShop.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	
	private CustomersCheckService customersService;
	
	public StarbucksCustomerManager(CustomersCheckService customersService) {
		this.customersService = customersService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		
		if(customersService.checkIfRealPerson(customer)) {
			
			 super.save(customer);
			//System.out.println("Saved to db starbucks: "+customer.getFirstName());
			
		} 
		else {
			
			 super.save(customer);
			//throw new Exception("Not valid person");
		}
	}

	

}


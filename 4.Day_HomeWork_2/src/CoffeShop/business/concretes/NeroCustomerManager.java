package CoffeShop.business.concretes;

import CoffeShop.adapters.CustomersCheckService;
import CoffeShop.business.abstracts.BaseCustomerManager;
import CoffeShop.entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	

private CustomersCheckService customersService;
	
	public NeroCustomerManager(CustomersCheckService customersService) {
		this.customersService = customersService;
	}
	
	
	@Override
	public void save(Customer customer) throws Exception {
		if(customersService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db nero: "+customer.getFirstName());
		} else {
			throw new Exception("Not valid person");
		}
	}
}

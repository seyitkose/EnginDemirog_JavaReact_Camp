package CoffeShop.business.abstracts;

import CoffeShop.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	
	
	@Override
	public void save(Customer customer) throws Exception {
		
		System.out.println("Saved to Db: " + customer.getFirstName());

}
}

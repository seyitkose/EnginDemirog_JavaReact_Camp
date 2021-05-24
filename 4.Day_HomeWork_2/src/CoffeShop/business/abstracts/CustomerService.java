package CoffeShop.business.abstracts;

import CoffeShop.entities.concretes.Customer;

public interface CustomerService {

	
	void save(Customer customer) throws Exception;
}

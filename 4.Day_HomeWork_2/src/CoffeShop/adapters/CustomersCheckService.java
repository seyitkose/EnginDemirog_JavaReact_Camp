package CoffeShop.adapters;

import CoffeShop.entities.concretes.Customer;

public interface CustomersCheckService {
	
	boolean checkIfRealPerson(Customer customer);

}

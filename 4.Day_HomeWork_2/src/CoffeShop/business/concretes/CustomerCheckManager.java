package CoffeShop.business.concretes;

import CoffeShop.adapters.CustomersCheckService;
import CoffeShop.entities.concretes.Customer;

public class CustomerCheckManager implements CustomersCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}
	

}

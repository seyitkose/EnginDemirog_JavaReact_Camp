package CoffeShop.entities.concretes;



import CoffeShop.entities.abstracts.Entity;

public class Customer implements Entity{
	
private Long nationalIdentity;
private String firstName;
private String lastName;
private int timeOfBirth;



public Customer(Long nationalIdentity, String firstName, String lastName, int timeOfBirth) {
	super();
	this.nationalIdentity = nationalIdentity;
	this.firstName = firstName;
	this.lastName = lastName;
	this.timeOfBirth = timeOfBirth;
}



public Long getNationalIdentity() {
	return nationalIdentity;
}



public void setNationalIdentity(Long nationalIdentity) {
	this.nationalIdentity = nationalIdentity;
}



public String getFirstName() {
	return firstName;
}



public void setFirstName(String firstName) {
	this.firstName = firstName;
}



public String getLastName() {
	return lastName;
}



public void setLastName(String lastName) {
	this.lastName = lastName;
}



public int getTimeOfBirth() {
	return timeOfBirth;
}



public void setTimeOfBirth(int timeOfBirth) {
	this.timeOfBirth = timeOfBirth;
}







}


package Entities;

import java.time.LocalDate;

import Abstract.Entity;


public class Customer implements Entity {
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate dateOfBirth;
    public long nationalityId;
	
    
    public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, long nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}


}

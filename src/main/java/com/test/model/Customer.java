package com.test.model;

import java.util.ArrayList;
import java.util.List;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



//@Document(collection = "customer")
@Document(indexName = "customer", type = "customer", shards = 1)
public class Customer {

	@Id
	public Long id;

	public String firstName;
	public String lastName;
	public String mobileNumber;
	public String address;
	// public List<Payment> payment=new ArrayList<Payment>();



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobile_number) {
		this.mobileNumber = mobile_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", address=" + address + "]";
	}
	public void setId(Long id) {
		this.id = id;
	}

}

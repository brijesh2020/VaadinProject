package com.example.serviceclient;

public interface CustomerService {
	void store(CustomerDTO customer);
	
	CustomerDTO getCustomerByIDd(long id);
}

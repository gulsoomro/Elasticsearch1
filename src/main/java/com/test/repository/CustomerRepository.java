package com.test.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Customer;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, Long> //CrudRepository<Customer, Long> 
{
	List<Customer> findAll();
	Customer findById(long id);
	
}

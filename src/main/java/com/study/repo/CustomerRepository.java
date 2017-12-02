package com.study.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.study.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}
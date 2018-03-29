package com.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Customer;
import com.test.repository.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepo;
	
	@ResponseBody
    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.GET, path = "/test")
	public
	String test() {
		return "working";
	}
	
    @RequestMapping(method = RequestMethod.POST, path = "/insert")
    public @ResponseBody boolean addCustomer(@RequestBody Customer customer) {
		System.out.println("HIT insert");
		boolean result = false;
        try {
        	System.out.println(customer);
            customerRepo.save(customer);
            result = true;
        } catch (Exception e) {
            return false;
        }
        return result;
    }
		
	
    @RequestMapping(method = RequestMethod.GET, path = "/get")
    public @ResponseBody Customer getCustomerbyId(@RequestParam(value="id") long id)
    {
    	
		System.out.println("HIT");
		Customer customer = null;
	//	long idd=Long.parseLong(customerRepo.findById(id).toString()) ;
		//	if(idd==id){
				try {
					customer = customerRepo.findById(id);
					System.out.println(customer);
				} catch (Exception e) {
					
    		
    	}
            return customer;
        //}
      //  return customer;
    }
	
    @RequestMapping(method = RequestMethod.GET, path = "/delete")
    public @ResponseBody boolean deleteCustomerbyId(@RequestParam(value="id") long id) 
    
    {
		System.out.println("HIT");
		boolean result = false;
        try {
            Customer customer = customerRepo.findById(id);
            if(customer!=null) {
            	customerRepo.delete(customer);
            	result = true;
            }
        } catch (Exception e) {
            return true;
        }
        return result;
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public @ResponseBody List<Customer> getCustomers() 
    {
		System.out.println("HIT");
		List<Customer> customers = customerRepo.findAll();
//        try {
//           
//        } catch (Exception e) {
//            return customers;
//        }
        return customers;
    }
		

}

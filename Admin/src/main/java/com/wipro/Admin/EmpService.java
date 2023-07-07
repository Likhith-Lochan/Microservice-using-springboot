package com.wipro.Admin;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
@Service
public class EmpService {
	@Autowired
	EmpRepo emprepo;
	
	@Autowired
	EmpProxy empproxy;
	
	
	@Value("${pivotal.empservice.name}")
	 protected String empservice;
	@SuppressWarnings("unchecked")
	public List<EmpModel> all() {
		
		
		
		List<EmpModel> a=empproxy.empdata();
		
				 
		return a;

		
	}

	 
	 

}

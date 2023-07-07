package com.wipro;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@FeignClient(value = "AdminPage-Service")
public interface AdminProxy {
   
	@GetMapping("/getAdmin")
	public ModelAndView retr();
	
}

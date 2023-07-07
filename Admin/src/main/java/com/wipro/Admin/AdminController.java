package com.wipro.Admin;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
///import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;



@Controller
public class AdminController {
	@Autowired
	EmpService emp;
	
	@GetMapping("/")
	public String ggg() {
		
		return "name";
	}

	@GetMapping("/getAdmin")
	@ResponseBody
	public List<EmpModel> retr() {
		
		return emp.all();
	}

}

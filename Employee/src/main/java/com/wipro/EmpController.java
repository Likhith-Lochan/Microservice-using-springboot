package com.wipro;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {

	@Autowired
	EmpService emps;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@PostMapping("/validate")
	public String validate(@ModelAttribute("userid") String userid,@ModelAttribute("password") String password,@ModelAttribute("det") String val){
		HashMap<Integer,String> emp=new HashMap<>();
		emp.put(2036,"raju@123");
		emp.put(2048,"Bharath@K");
		emp.put(3333,"Venky$0112");
		
		HashMap<Integer,String> adm=new HashMap<>();
		adm.put(1234,"123@pranay");
		adm.put(1235,"MSharath09");
	   if(val=="emp") {
		  if(emp.containsKey(Integer.valueOf(userid)) && emp.get(Integer.valueOf(userid))==(password)) {
			    return "employee";
		  }
		   
	   }
	   else {
		   if(adm.containsKey(Integer.valueOf(userid)) && adm.get(Integer.valueOf(userid))==(password)) {
			   return "adm";
		   }
		   
	   }
	   return "fail";
   }

	
	
	@PostMapping("/adddata")
	public String data(@ModelAttribute("userid") String userid,@ModelAttribute("test") String test,@ModelAttribute("date") String date) {
		EmpModel e=new EmpModel(Integer.valueOf(userid),test,date);
		emps.addemp(e);
		
		return "success";
	}
	@GetMapping("/tech")
	public String gett() {
		return "tech";
	}
	@GetMapping("/beha")
	public String getb() {
		return "beha";
	}
	@GetMapping("/admin")
	public ModelAndView adm() {
		return  emps.admin();
	}
	
	@GetMapping("/alldata")
	public ModelAndView empdata() {
		return emps.alld();
	}
	
	
	
	
}

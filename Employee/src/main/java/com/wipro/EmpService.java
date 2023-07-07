package com.wipro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;



@Service
public class EmpService {
	@Autowired
	EmpRepo emprepo;
	
	public EmpModel addemp(EmpModel emp) {
		return emprepo.save(emp);
	}
	
	public List<EmpModel> getdata(){
		 return emprepo.findAll();
	 }
	
	public Optional<EmpModel> getemp(Integer id){
		return emprepo.findById(id);
	}
	
	public ModelAndView alld() {
		ModelAndView mv=new ModelAndView();
		List<EmpModel> a=this.getdata();
		for(int i=0;i<a.size();i++) {
			mv.addObject("empModel",a.get(i));
		}
		mv.setViewName("last");
		return mv;
	}
	
	@Autowired
	private AdminProxy admproxy;
	
	@Value("${pivotal.adminpageservice.name}")
	 protected String adminpageservice;
	public ModelAndView admin() {
		return admproxy.retr();
		
	}
	
	 
	 
	 

}

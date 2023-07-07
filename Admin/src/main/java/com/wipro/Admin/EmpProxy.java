package com.wipro.Admin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
@FeignClient(value = "Employee-Service")
public interface EmpProxy {
   @GetMapping("/alldata")
   public List<EmpModel> empdata();
}

package com.healthCallTestList.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthCallTestList.Entity.Test;
import com.healthCallTestList.Service.TestService;
@CrossOrigin("*")
@RestController
@RequestMapping("/test/")
public class TestListController {
	
@Autowired
 private TestService Testservice;
@PostMapping("save")
public Test oneSave(@RequestBody Test T) {
	return Testservice.oneSave(T);
}
   @GetMapping("get")
   public List<Test> getall(){
	   return Testservice.get();
   }
   
   @PutMapping("put")
   public void update(@RequestBody Test S) {
	   Testservice.saveOrUpdate(S);
   }
  }

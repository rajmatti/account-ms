package com.siyatech.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;

	
		@GetMapping(value="/accounts/{empId}") 
	  public List<Account>getAccountsByEmpId(@PathVariable int empId) { 
	    System.out.println("EmpId------" + empId);
	    List<Account> empAccountList = accountService.findAccountsByEmpId(empId);
	    return empAccountList; 
	  }
}

package com.cognizant.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bank")
public class AccountController {
	 private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	 
	 @GetMapping(path="/account/{number}")
	 public String getAccount(@PathVariable int number) {
		 return "number: \"00987987973432\", type: \"savings\", balance: 234343, AccountId: "+number;
	 }

}

package com.cognizant.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class LoanController {
	 private static final Logger logger = LoggerFactory.getLogger(LoanController.class);
	 
	 @GetMapping(path="/loan/{number}")
	 public String getAccount(@PathVariable int number) {
		 return " number: H00987987972342, type: car, loan: 400000, emi: 3258, tenure: 18, loanId: "+number;
	 }

}

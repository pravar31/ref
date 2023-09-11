package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Credentials;
import com.springrest.springrest.services.serviceint;
import com.springrest.springrest.services.services;

@RestController
public class MyController {
	@GetMapping("/home")
	 public String getname() {
		 return "pravar";
	 }
	@Autowired
	public serviceint si;
	@GetMapping("/credentials")
	public List<Credentials> GetCredentials(){
		return this.si.GetCredentials();
		
	}

}

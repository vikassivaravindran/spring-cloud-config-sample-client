package com.vikas.app;

import java.util.Arrays;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCredentials {

	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
@GetMapping(value="/home")
public List<String> welcome(){
	return Arrays.asList(
			"The Username is:"+username,
			"The Password is:"+password);
}
}

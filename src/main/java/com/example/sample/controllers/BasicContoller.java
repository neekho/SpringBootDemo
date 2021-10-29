package com.example.sample.controllers;


import com.demo.models.person.Person;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class BasicContoller {

    @GetMapping(value = "/api_check", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> livenessCheck() {

		return ResponseEntity.ok("200 Up and Running");
	}

    //localhost:8080/user/username
    @GetMapping(value = "/user/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> findUser(@PathVariable("username") String username) {


        return ResponseEntity.ok("username: " + username);
    }

    //localhost:8080/user_income?username="username"&income=income
    @GetMapping(value = "/user_income", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> userIncome(@RequestParam("username") String username, @RequestParam("income") int income ) {

        return ResponseEntity.ok(username + " has an income of " + income + " PHP");
    }

    // http post method
	//http://localhost:8080/send/person_info

    @PostMapping(value = "/post/person", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE) 
        public ResponseEntity<Object> postData(@RequestBody Person person) {
            return ResponseEntity.ok(person.getFirstName() + person.getCityName() + person.getAge());

        }
    

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> delete(@PathVariable String id) {
		return ResponseEntity.ok("deleting: " + id);
	}
	
    

}

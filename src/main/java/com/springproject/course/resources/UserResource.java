package com.springproject.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.course.entities.User;

@RestController
@RequestMapping(value =  "/users")
public class UserResource {
	
	 @GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Pablo","pablo@gmail.com", "9988744", "1911929");
		return ResponseEntity.ok().body(u);
	}
}

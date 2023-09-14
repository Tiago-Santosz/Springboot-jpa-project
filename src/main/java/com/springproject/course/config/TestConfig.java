package com.springproject.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springproject.course.entities.User;
import com.springproject.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
 @Autowired
 private UserRepository userRepository;

@Override
public void run(String... args) throws Exception {
	User u1 = new User (null, "Alonso Silveston", "alonso@gmail.com", "789974560", "4587001");
	User u2 = new User (null, "Williams Brithon", "williams@gmail.com", "788934560", "3287901");
	userRepository.saveAll(Arrays.asList(u1, u2));
}
}

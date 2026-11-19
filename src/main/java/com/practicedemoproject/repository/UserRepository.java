package com.practicedemoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.practicedemoproject.model.User;

@Component
public interface UserRepository extends JpaRepository<User,Integer>{
	
	User findByUserNameAndPassword(String un,String psw);

}

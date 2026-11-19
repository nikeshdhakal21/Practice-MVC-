package com.practicedemoproject.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicedemoproject.model.User;
import com.practicedemoproject.repository.UserRepository;
import com.practicedemoproject.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired  
	private UserRepository usrRepo;
	
	@Override
	public void signup(User u) {
		
		usrRepo.save(u);
		
		
	}

	@Override
	public User login(String un, String psw) {
		// TODO Auto-generated method stub
		return usrRepo.findByUserNameAndPassword(un, psw);
	}

}

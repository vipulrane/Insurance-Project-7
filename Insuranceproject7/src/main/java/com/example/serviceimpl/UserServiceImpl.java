package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepository;

	@Override
	public User saveUser(User user) {
		User user1 = userrepository.save(user);
		return user1;
	}

	@Override
	public List<User> getAllUserDetails() {
		List<User> userlist = userrepository.findAll();
		return userlist;
	}

	@Override
	public void deleteUserById(Integer id) {
		userrepository.deleteById(id);
		
	}

	@Override
	public User getUserById(Integer id) {
        Optional<User> user1=userrepository.findById(id);
        User user2=null;
        if(user1.isPresent()) {
        	user2=user1.get();
        }
		return user2;
	}

}

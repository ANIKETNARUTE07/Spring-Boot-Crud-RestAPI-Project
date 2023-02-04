package com.jsp.springbootproject2save.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.springbootproject2save.dao.UserDao;
import com.jsp.springbootproject2save.dto.ResponseStructure;
import com.jsp.springbootproject2save.dto.User;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	public ResponseStructure<User> saveUser(User user){
		ResponseStructure<User> responseStructure= new ResponseStructure<User>();
		User user1 = userDao.saveUser(user);
		if (user1 != null) {
			responseStructure.setData(user1);
			responseStructure.setStatuscode(HttpStatus.CREATED.value());
			responseStructure.setMessage("User saved");
			return responseStructure;

		} else {
			responseStructure.setData(null);
			responseStructure.setStatuscode(HttpStatus.CREATED.value());
			responseStructure.setMessage("User not saved");
			return responseStructure;
		}
	}
	// get admin by id
		public ResponseStructure<User> getUserById(int id) {

			ResponseStructure<User> responseStructure = new ResponseStructure<User>();
			User user = userDao.getUserById(id);
			if (user != null) {
				responseStructure.setData(user);
				responseStructure.setStatuscode(HttpStatus.CREATED.value());
				responseStructure.setMessage("Success");
			} else {
				responseStructure.setData(null);
				responseStructure.setStatuscode(HttpStatus.CREATED.value());
				responseStructure.setMessage("Failed");

			}
			return responseStructure;
		}

		public ResponseStructure<User> updateUser(int id, User user) {
			ResponseStructure<User> responseStructure = new ResponseStructure<User>();
			User user1 = userDao.updateUserById(id, user);
			if (user1 != null) {
				responseStructure.setData(user1);
				responseStructure.setStatuscode(HttpStatus.CREATED.value());
				responseStructure.setMessage("Updated");
			} else {
				responseStructure.setData(null);
				responseStructure.setStatuscode(HttpStatus.CREATED.value());
				responseStructure.setMessage("Not Updated");

			}
			return responseStructure;
		}

		public ResponseStructure<String> deleteUser(int id) {
			ResponseStructure<String> responseStructure = new ResponseStructure<String>();
			boolean flag = userDao.deleteUserById(id);
			if (flag) {
				responseStructure.setData("Data deleted");
				responseStructure.setStatuscode(HttpStatus.OK.value());
				responseStructure.setMessage("Deleted");
			} else {
				responseStructure.setData("Data Not deleted");
				responseStructure.setStatuscode(HttpStatus.OK.value());
				responseStructure.setMessage("Not Deleted");

			}
			return responseStructure;
		}

		public ResponseStructure<List<User>> getAllusers() {
			ResponseStructure<List<User>> responseStructure = new ResponseStructure<List<User>>();
			List<User> users = userDao.getAllUsers();
			if (users.size() > 0) {
				responseStructure.setData(users);
				responseStructure.setStatuscode(HttpStatus.CREATED.value());
				responseStructure.setMessage("Success");
			} else {
				responseStructure.setData(null);
				responseStructure.setStatuscode(HttpStatus.CREATED.value());
				responseStructure.setMessage("Not Success");
			}
			return responseStructure;
		}


}

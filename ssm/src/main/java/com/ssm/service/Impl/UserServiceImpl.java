package com.ssm.service.Impl;

import java.util.List;  

import javax.annotation.Resource;  
  
import org.springframework.stereotype.Service;  
  
import com.ssm.dao.UserDao;  
import com.ssm.po.User;  
import com.ssm.service.UserService;  
  
@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Resource  
    private UserDao userDao;  
      
    public User getUserById(int userId) {  
        return userDao.queryByPrimaryKey(userId);  
    }  
  
    public void insertUser(User user) {  
        userDao.insertUser(user);  
    }  
  
    public void addUser(User user) {  
        userDao.insertUser(user);  
    }  
  
    @Override  
    public List<User> getAllUser() {  
        return userDao.getAllUser();  
    }  
  
}  
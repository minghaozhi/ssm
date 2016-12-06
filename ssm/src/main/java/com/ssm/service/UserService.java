package com.ssm.service;


import java.util.List;  

import com.ssm.po.User;  

public interface UserService {  
    
  public User getUserById(int userId);  

  public void insertUser(User user);  

  public void addUser(User user);  

  public List<User> getAllUser();  
}  
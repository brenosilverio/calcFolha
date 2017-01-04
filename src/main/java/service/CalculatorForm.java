package service;

import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import model.Users;

@Service
public class CalculatorForm {
    
    @Autowired
    private UserDao userDao;

    @Transient
    public void saveUser(String name, String mail, String pass) {
        
        Users users = new Users();
        
        users.setName(name);
        users.setEmail(name);
        users.setPass(pass);
        
        userDao.save(users);
    }
    
}

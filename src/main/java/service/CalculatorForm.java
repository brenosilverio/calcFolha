package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import model.Users;

@Service
public class CalculatorForm {
    
    @Autowired
    private UserDao userDao;

    public void saveUser(Users users) {
        userDao.save(users);
    }
}

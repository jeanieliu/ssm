package com.neuedu.service.imple;

import com.neuedu.dao.IUserDAO;
import com.neuedu.entity.User;
import com.neuedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    public List<User> getVipAll() {
        return userDAO.selectAllByUlevel(1);
    }

    public List<User> getAdminAll() {
        return userDAO.selectAllByUlevel(0);
    }

    @Transactional(propagation= Propagation.REQUIRED,readOnly = true)
    public void modify(User user) {

         userDAO.deleteUser(15);//正常
         userDAO.insertUser(user);//错误的
    }
}

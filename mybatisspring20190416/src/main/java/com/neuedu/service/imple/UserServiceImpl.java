package com.neuedu.service.imple;

import com.neuedu.dao.IUserDAO;
import com.neuedu.entity.User;
import com.neuedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    public List<User> getVipAll() {
        return userDAO.selectAllByUlevel(1);
    }

    public List<User> getAdminAll() {
        return userDAO.selectAllByUlevel(0);
    }

    public void modify(User user) {

    }
}

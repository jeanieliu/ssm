package com.neuedu.service.imple;

import com.neuedu.dao.ICategoryDAO;
import com.neuedu.entity.Category;
import com.neuedu.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService{

    @Autowired
    private ICategoryDAO categoryDAO;


    public List<Category> getAll() {
        return categoryDAO.selectAll();
    }
}

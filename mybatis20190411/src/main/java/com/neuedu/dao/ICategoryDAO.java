package com.neuedu.dao;

import com.neuedu.entity.Category;

import java.util.List;

public interface ICategoryDAO {

    List<Category> selectAll();
}

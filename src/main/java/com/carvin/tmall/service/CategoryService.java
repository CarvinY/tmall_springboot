package com.carvin.tmall.service;

import com.carvin.tmall.dao.CategoryDAO;
import com.carvin.tmall.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;
    public List<Category> list(){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        return categoryDAO.findAll(sort);
    }
}

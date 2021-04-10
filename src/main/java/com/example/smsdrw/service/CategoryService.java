package com.example.smsdrw.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.smsdrw.model.Category;
import com.example.smsdrw.repository.CategoryRepository;

@Service
public class CategoryService extends BaseService<Category,Long,CategoryRepository>{

}

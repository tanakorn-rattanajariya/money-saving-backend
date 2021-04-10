package com.example.smsdrw.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smsdrw.model.Category;

@RestController
@RequestMapping("/category")
public class CategoryController extends controller<Category,Long> {

	@Override
	public ResponseEntity<?> get(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.category.get(id));
	}

	@Override
	public ResponseEntity<?> list() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.category.list(0));
	}

	@Override
	public ResponseEntity<?> post(Category data) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.category.post(data));
	}

	@Override
	public ResponseEntity<?> put(Category data, Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.category.put(data, id));
	}

	@Override
	public ResponseEntity<?> delete(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(service.category.delete(id));
	}
}

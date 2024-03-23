package com.je.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.je.models.Product;
import com.je.service.ProductService;

@RestController
@RequestMapping("/consumer/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		System.out.println("before createProduct of ProductController"+ product);
		return productService.createProduct(product);
	//	System.out.println("before createProduct of ProductController"+ product);
		
	}
}

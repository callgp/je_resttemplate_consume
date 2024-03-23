	package com.je.models;
	
	import java.util.List;
	
	import com.fasterxml.jackson.annotation.JsonIgnore;
	
	
	
	public class Category {
	
		private Integer id;
		
		
		private String name;
		
		private List<Product> products;
		
		public Category() {
			// TODO Auto-generated constructor stub
		}
	
		public Integer getId() {
			return id;
		}
	
		public void setId(Integer id) {
			this.id = id;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public List<Product> getProducts() {
			return products;
		}
	
		public void setProducts(List<Product> products) {
			this.products = products;
		}
		
	}

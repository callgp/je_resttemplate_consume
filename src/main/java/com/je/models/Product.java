package com.je.models;

import java.util.Date;


public class Product {

	private Integer id;
	
	private String name;
	
	private Double price;
	
	private String description;
	
	private String barCode;
	
	private ProductStatus productStatus;
	
	private Date createdTime;
	
	private Date updatedTime;
	
	private Category category;
	
	public Product() {
	}

	public ProductStatus getProductStatus() {
		return productStatus;
	}



	public void setProductStatus(ProductStatus productStatus) {
		this.productStatus = productStatus;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
}

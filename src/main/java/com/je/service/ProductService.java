package com.je.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.je.models.Product;
@Service
public class ProductService {

	@Autowired
	private RestTemplate restTemplate;

	public Product createProduct(Product product) {

		try {
			System.out.println("before createProduct of ProductService"+ product);
			String url = "http://localhost:9095/api/v1/products";

			// headers rqd
			// input request obj
			// output datatype
			HttpHeaders httpHeader = new HttpHeaders();
			httpHeader.set("Content-Type", "application/json");
			httpHeader.set("Accept", "application/json");

			HttpEntity<Product> entity = new HttpEntity<>(product, httpHeader);
			System.out.println("before responseEntity of ProductService"+ product);
			ResponseEntity<Product> responseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, Product.class);
			System.out.println("after responseEntity of ProductService"+ product);
			if (responseEntity.getStatusCode().value() == 201) {
				Product returnProduct = responseEntity.getBody();
				System.out.println("after createProduct of ProductService"+ product);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

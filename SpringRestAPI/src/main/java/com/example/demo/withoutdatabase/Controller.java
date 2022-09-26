package com.example.demo.withoutdatabase;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/productDetails")      //Display all record:   http://localhost:8080/productDetails 
	public List<Product> getProduct()  //method creating
	{
		return ProductService.getProductDetails();
	}
	
	@GetMapping("/productdetailbyid/{id}")      //Path Variable:  localhost:8080/productdetailbyid/2 
	public Product getProductById(@PathVariable int id)
	{
		return ProductService.getProductById(id);
	}
	
	@GetMapping("/productdetailbyid")      //RequestParam is:  localhost:8080/productdetailbyid?pid=2
	public Product getProductByIdOne(@RequestParam("pid") int id)
	{
		return ProductService.getProductById(id);
	}
	
	@PostMapping("/addproduct")           // localhost:8080/addproduct {"pname":"Soap", "price":1000}
	public Product addProductData(@RequestBody Product p)
	{
		return ProductService.addProduct(p);
	}
	
	@DeleteMapping("/delete/{id}")    // localhost:8080/delete/5
	public Product removeWithId(@PathVariable int id)
	{
		return ProductService.removeProduct(id);
	}
	
//	@PutMapping("/update")    // localhost:8080/delete/5
//	public Product removeWithId(@PathVariable int id)
//	{
//	
//	}

	
}

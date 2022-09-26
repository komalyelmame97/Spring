package com.example.demo.withoutdatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	private static Map<Integer,Product> ps = new HashMap();
	private static int index=4;
	static {
		Product p1 = new Product(1, "Facewash", 1000);
		Product p2 = new Product(2, "Oil", 2000);
		Product p3 = new Product(3, "Soap", 3000);
		ps.put(1, p1);
		ps.put(2, p2);
		ps.put(3, p3);
	}
	public static List<Product> getProductDetails() //method creating
	{
		return new  ArrayList<>(ps.values());
	}
	
	public static Product getProductById(int id)
	{
		return ps.get(id);
	}
	
	public static Product addProduct(Product p)
	{
		index+=1;
		p.setId(index);
		ps.put(index, p);
		return p;
	}
	
	public static Product removeProduct(int id)
	{
		return ps.remove(id);
	}
	
	
//	   //Update......
//	public static Product updateProduct(int id,int price p)
//	{
//	
//	}


}

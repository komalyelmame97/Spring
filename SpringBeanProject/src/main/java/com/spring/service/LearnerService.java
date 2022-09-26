package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.spring.entity.Learner;

public class LearnerService {
	private static List<Learner> list = new ArrayList<Learner>();
	static {
		Learner l = new Learner(1, "Komal", "Pune", 23);
		list.add(l);
		Learner l1 = new Learner(2, "Amruta", "Pune", 24);
		list.add(l1);
		Learner l2 = new Learner(3, "Ankita", "Pune", 25);
		list.add(l2);
	}
    public List<Learner> getList(){
    	return list;
    }
    
}

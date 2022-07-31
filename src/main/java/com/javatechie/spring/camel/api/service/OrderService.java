package com.javatechie.spring.camel.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.javatechie.spring.camel.api.model.ModelOder;

@Service
public class OrderService {

	private List<ModelOder> list = new ArrayList<>();

	@PostConstruct
	public void initDB() {
		list.add(new ModelOder(67, "Mobile", 5000));
		list.add(new ModelOder(89, "Book", 400));
		list.add(new ModelOder(45, "AC", 15000));
		list.add(new ModelOder(67, "Shoes", 4000));
	}

	public ModelOder addOrder(ModelOder modelOder) {
		list.add(modelOder);
		return modelOder;
	}

	public List<ModelOder> getOrders() {
		return list;
	}

}

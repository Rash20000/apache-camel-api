package com.javatechie.spring.camel.api.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javatechie.spring.camel.api.model.ModelOder;
import com.javatechie.spring.camel.api.service.OrderService;

@Component
public class AddOrderProcessor implements Processor{
	
	@Autowired
	private OrderService service;

	@Override
	public void process(Exchange exchange) throws Exception {
		service.addOrder(exchange.getIn().getBody(ModelOder.class));
	}

}

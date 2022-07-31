package com.javatechie.spring.camel.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ModelOder {
	
	private int id;
	private String name;
	private double price;

}

package com.devcamp.pizza365.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devcamp.pizza365.repository.IOrderRepository;
import com.devcamp.pizza365.model.*;

@CrossOrigin
@RestController
@RequestMapping("/")
public class COrderController {
	
	@Autowired
	IOrderRepository pOrderRepository;
	
	@GetMapping("/orders")
	public ResponseEntity<List<COrder>> getOrder(){
		try {
			List<COrder> pOrders = new ArrayList<COrder>();
			
			pOrderRepository.findAll().forEach(pOrders::add);
			
			return new ResponseEntity<>(pOrders, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

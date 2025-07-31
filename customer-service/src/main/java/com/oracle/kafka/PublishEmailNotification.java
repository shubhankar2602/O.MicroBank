package com.oracle.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.oracle.customer.model.Customer;



@Service
public class PublishEmailNotification {
	@Autowired
	private KafkaTemplate<String,Customer> kafkaTemplate;

//	public void sendEmailNotification(String emailMessage) {
//		kafkaTemplate.send("emailTopic",emailMessage);
//	}
	
	public void sendEmailNotification(Customer customer) {
		kafkaTemplate.send("emailTopic",customer);
	}
}

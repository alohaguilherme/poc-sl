package com.consumer.demo.service.implementation;

import com.consumer.demo.dto.Message;
import com.consumer.demo.service.ConsumerService;

import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

  @Override
  public void action(Message message) {
    System.out.println(message.getText());
  }
}

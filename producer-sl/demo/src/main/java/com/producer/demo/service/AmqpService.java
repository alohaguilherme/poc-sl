package com.producer.demo.service;

import com.producer.demo.dto.Message;

public interface AmqpService {
  void sendToConsumer(Message message);
}

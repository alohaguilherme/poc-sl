package com.producer.demo.service.implementation;

import com.producer.demo.amqp.AmqpProducer;
import com.producer.demo.dto.Message;
import com.producer.demo.service.AmqpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService implements AmqpService {

  @Autowired
  private AmqpProducer<Message> amqp;

  @Override
  public void sendToConsumer(Message message) {
    amqp.producer(message);
  }
}

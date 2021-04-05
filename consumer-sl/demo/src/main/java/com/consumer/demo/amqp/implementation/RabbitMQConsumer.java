package com.consumer.demo.amqp.implementation;

import com.consumer.demo.amqp.AmqpConsumer;
import com.consumer.demo.dto.Message;
import com.consumer.demo.service.ConsumerService;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer implements AmqpConsumer<Message> {

  @Autowired
  private ConsumerService consumerService;

  @Override
  @RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
  public void consumer(Message message) {
    consumerService.action(message);

  }
}

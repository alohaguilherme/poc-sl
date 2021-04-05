package com.producer.demo.amqp;

public interface AmqpProducer<T> {
  void producer(T t);
}

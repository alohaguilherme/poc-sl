package com.producer.demo.api;

import com.producer.demo.dto.Message;
import com.producer.demo.service.AmqpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmqpApi {

  @Autowired
  private AmqpService service;

  @ResponseStatus(HttpStatus.ACCEPTED)
  @PostMapping("/paises")
  public void paisesSendToConsumer(@RequestBody Message message) {
    service.sendToConsumer(message);
  }

  @PostMapping("/estados")
  public void estadosSendToConsumer(@RequestBody Message message) {
    service.sendToConsumer(message);
  }
}

package com.daxia.eshop.datasync.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/2 14:17
 * @Version 1.0
 */

@Component
public class RabbitMQSender {
    
    @Autowired
    private AmqpTemplate amqpTemplate;
    
    public void send(String queue,String message){
        amqpTemplate.convertAndSend(queue,message);
    }
}

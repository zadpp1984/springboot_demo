package org.cay.demo.mq.customer;

import org.cay.demo.mq.SendBean;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQ_Customer {

    @RabbitListener(queues = "demo") // 监听器监听指定的Queue
    public void processC(SendBean sendBean) {
        System.out.println("Receive:" + sendBean.toString());
    }

}

package org.cay.demo.mq.customer;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQ_Config {

    @Bean(name = "demo")
    public Queue queueMessage() {
        return new Queue("demo");
    }
}

package org.cay.demo.mq.producer;

import java.util.Random;

import org.cay.demo.mq.SendBean;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQ_Producer implements CommandLineRunner {

    @Autowired
    AmqpTemplate amqptemplate;

    public void writeMq() {
        amqptemplate.convertAndSend("demo", createRandomSendBean());
    }

    SendBean createRandomSendBean() {
        String str = "zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        Random ra = new Random();
        int i = ra.nextInt(62);

        SendBean sendBean = new SendBean();
        sendBean.setId(i);
        sendBean.setValue(str.substring(i, i + 1));
        return sendBean;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 5; i++) {
            writeMq();
        }
    }
}

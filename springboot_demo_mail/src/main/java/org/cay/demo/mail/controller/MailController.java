package org.cay.demo.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    JavaMailSender javaMailSender;

    @RequestMapping(value = "/sendMail", method = RequestMethod.GET)
    private void sendMail() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("chenay_dl@softroad.com.cn");
        simpleMailMessage.setTo("chenay_dl@softroad.com.cn");
        simpleMailMessage.setSubject("subject");
        simpleMailMessage.setText("text");
        javaMailSender.send(simpleMailMessage);
    }
}

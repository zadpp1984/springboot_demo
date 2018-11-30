package org.cay.demo.mq;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class SendBean implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7500014711522765089L;

    int id;
    String value;
}

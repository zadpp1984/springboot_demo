package org.cay.demo.mvc.controller;

import org.cay.demo.mvc.TestBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    private final static Logger logger = LoggerFactory.getLogger(BasicRestController.class);

    @RequestMapping(value = "/date", method = RequestMethod.GET)
    private String date() {
        java.util.Calendar c = java.util.Calendar.getInstance();
        java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");
        System.out.println(f.format(c.getTime()));
        return f.format(c.getTime());
    }

    @RequestMapping(value = "/getTestBean", method = RequestMethod.GET)
    private TestBean getTestBean(@RequestParam(value = "id", defaultValue = "1") String id) {
        TestBean tb = new TestBean();
        tb.setId(id);
        tb.setValue("abc");
        return tb;
    }
}

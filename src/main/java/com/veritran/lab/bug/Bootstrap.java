package com.veritran.lab.bug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Bootstrap {

    static Logger log = LoggerFactory.getLogger(Bootstrap.class);

    public static void main(String[] args) {

        log.info("Starting Application-{}", Version.VERSION_STRING);

        log.trace("CLASSPATH: {}", System.getProperty("java.class.path"));
        ApplicationContext context = new ClassPathXmlApplicationContext("service-context.xml");
        log.info("Service Started - Name={}-{} DateTime={}", "Application", Version.VERSION_STRING, new Date());

    }
}
package com.veritran.lab.bug.service.soap;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CxfBootstrap {

    private final HelloWorldService helloWorldService;
    private final String address;
    private Server server;

    static Logger log = LoggerFactory.getLogger(CxfBootstrap.class);

    public CxfBootstrap(HelloWorldService helloWorldService, String address) {
        this.helloWorldService = helloWorldService;
        this.address = address;
    }

    public void start() {

        log.info("Starting SOAP service on {}", address);
        JaxWsServerFactoryBean serverFactoryBean = new JaxWsServerFactoryBean();

        serverFactoryBean.setServiceBean(helloWorldService);

        server = serverFactoryBean.create();
        log.info("SOAP service started...");
    }

    public void stop() {

        log.info("Shutting down SOAP service");
        if (server != null) {
            server.stop();
        }
        log.info("SOAP service stopped...");
    }

}
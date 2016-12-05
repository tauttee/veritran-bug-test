package com.veritran.lab.bug.service.soap;

import com.veritran.lab.bug.data.dao.MessagesDao;
import com.veritran.lab.bug.exception.UnauthenticatedException;
import com.veritran.lab.bug.service.data.domain.Request;
import com.veritran.lab.bug.service.data.domain.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by Bruce A. Grobler on 9/10/14.
 */
public class HelloWorldServiceImpl implements HelloWorldService {

    static Logger log = LoggerFactory.getLogger(HelloWorldServiceImpl.class);

    @Autowired
    private MessagesDao messagesDao;

    @Override
    public Response processRequest(Request request) throws UnauthenticatedException {
        // log request
        log.info("REQUEST - Age={}, FirstName={}, LastName={}", request.getAge(), request.getFirstName(), request.getLastName());
        Long id = messagesDao.createMessage(request);

        Response response = new Response();

        response.setDateOfBirth("1970-01-01 00:00:00.000");
        response.setFunny(true);

        messagesDao.updateMessage(response);

        // log response
        log.info("RESPONSE - DateOfBirth={}, isFunny={} Id={}", response.getDateOfBirth(), response.isFunny(), response.getId());
        return response;

    }
}

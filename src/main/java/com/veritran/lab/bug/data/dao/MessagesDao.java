package com.veritran.lab.bug.data.dao;

import com.veritran.lab.bug.service.data.domain.Request;
import com.veritran.lab.bug.service.data.domain.Response;


public interface MessagesDao {

    Long createMessage(Request request);

    void updateMessage(Response response);
}

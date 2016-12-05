package com.veritran.lab.bug.service.soap;

import com.veritran.lab.bug.exception.UnauthenticatedException;
import com.veritran.lab.bug.service.data.domain.Request;
import com.veritran.lab.bug.service.data.domain.Response;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://secure.zss.co.zw/vportal/integration/HelloWorldService")
public interface HelloWorldService {

    @WebMethod(operationName = "ProcessRequest")
    public
    @WebResult(name = "Response")
    Response processRequest(@WebParam(name = "Requst") Request request) throws UnauthenticatedException;


}

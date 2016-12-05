package com.veritran.lab.bug.service.data.domain;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Request")
public class Request {

    private String firstName;
    private String lastName;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

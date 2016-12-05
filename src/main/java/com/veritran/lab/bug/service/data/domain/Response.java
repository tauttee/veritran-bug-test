package com.veritran.lab.bug.service.data.domain;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Response")
public class Response {
    private boolean isFunny;
    private String dateOfBirth;
    private Long id;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isFunny() {
        return isFunny;
    }

    public void setFunny(boolean isFunny) {
        this.isFunny = isFunny;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

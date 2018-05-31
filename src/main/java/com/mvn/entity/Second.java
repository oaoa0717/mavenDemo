package com.mvn.entity;

import java.io.Serializable;

public class Second implements Serializable {
    private Integer id;

    private String name;

    private String tbSecondcol;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTbSecondcol() {
        return tbSecondcol;
    }

    public void setTbSecondcol(String tbSecondcol) {
        this.tbSecondcol = tbSecondcol == null ? null : tbSecondcol.trim();
    }
}
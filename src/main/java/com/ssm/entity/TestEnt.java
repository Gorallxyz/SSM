package com.ssm.entity;

import org.springframework.stereotype.Component;

@Component
public class TestEnt {
    private Integer id;
    private String context;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "TestEnt{" +
                "id=" + id +
                ", context='" + context + '\'' +
                '}';
    }
}

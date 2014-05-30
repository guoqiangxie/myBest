package com.xgq.dto;

import java.io.Serializable;

/**
 * Created by xieguoqiang on 14-5-28.
 */
public class QueryDucumentDto implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

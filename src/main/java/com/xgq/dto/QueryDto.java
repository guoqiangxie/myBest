package com.xgq.dto;

/**
 * Created by xieguoqiang on 14-5-28.
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.Serializable;


@XmlRootElement
@XmlSeeAlso({QueryDucumentDto.class})
public class QueryDto<T> implements Serializable {

    private static final long serialVersionUID = 6946492098153406936L;

    private Pagination pagination;

    private T condition;

    public QueryDto() {
    }

    public QueryDto(Pagination pagination, T condition) {
        this.pagination = pagination;
        this.condition = condition;
    }


    @XmlElement
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public T getCondition() {
        return condition;
    }

    public void setCondition(T condition) {
        this.condition = condition;
    }

    public int getStartRow() {
        return pagination.getStartRow();
    }

    public int getEndRow() {
        return pagination.getEndRow();
    }

    public String getSidx() {
        return pagination.getSidx();
    }

    public String getSord() {
        return pagination.getSord();
    }

    @Deprecated
    public void setTotal(Integer count) {
        pagination.countRecords(count);
    }

    public int getRows() {
        return pagination.getRows();
    }
}


package com.xgq.dto;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlSeeAlso({DocumentDto.class})
public class ResultDto<T> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2863380748581744437L;


    private List<T> results = new ArrayList<T>();


    private Pagination pagination = new Pagination();


    private String queryId;

    public ResultDto() {
        pagination = new Pagination();
    }

    public ResultDto(Pagination pagination, List<T> results) {
        this.pagination = pagination;
        this.results = results;

    }

    @XmlElement
    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    @XmlElement
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public int getPage() {
        return pagination.getPage();
    }

    public int getRows() {
        return pagination.getRows();
    }

    public int getRecords() {
        return pagination.getRecords();
    }

    public int getTotal() {
        return pagination.getTotal();
    }

    public String getSidx() {
        return pagination.getSidx();
    }

    public String getSord() {
        return pagination.getSord();
    }

    public String getQueryId() {
        return queryId;
    }
    
    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public Boolean isHasElement() {
        return getResults() != null ? true : false;
    }
}

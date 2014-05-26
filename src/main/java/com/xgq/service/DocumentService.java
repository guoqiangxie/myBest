package com.xgq.service;

import com.xgq.model.Document;

import java.util.List;

/**
 * Created by xieguoqiang on 14-5-26.
 */
public interface DocumentService {
    public List<Document> selectDocumentByName(String name);

}

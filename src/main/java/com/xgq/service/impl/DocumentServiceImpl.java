package com.xgq.service.impl;

import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughSingleCache;
import com.xgq.dao.DocumentMapper;
import com.xgq.model.Document;
import com.xgq.model.User;
import com.xgq.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xieguoqiang on 14-5-26.
 */
@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentMapper documentMapper;

    @Override
    @ReadThroughSingleCache(namespace = "testDocuments")
    public List<Document> selectDocumentByName(@ParameterValueKeyProvider String name) {
//        生成的key为 testDocuments:${name}
        System.out.println(name);
        return documentMapper.selectDocumentByName("YZ集团VMware虚拟化解决方案");
    }
}

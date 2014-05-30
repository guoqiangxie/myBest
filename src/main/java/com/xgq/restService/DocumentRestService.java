package com.xgq.restService;

import com.xgq.common.RestClient;
import com.xgq.dto.DocumentDto;
import com.xgq.dto.QueryDto;
import com.xgq.dto.QueryDucumentDto;
import com.xgq.dto.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by xieguoqiang on 14-5-28.
 */
@Service("documentRestService")
public class DocumentRestService {
    @Autowired
    private RestClient restClient;

//    @Value(value = "${DOCUMENT_SERVER}")
//    private String documentServer;

    public ResultDto<DocumentDto> query(QueryDto<QueryDucumentDto> queryDto) {
        return restClient.post("http://127.0.0.1:8081/resteasy" + "/document/query", queryDto, ResultDto.class);
    }
}

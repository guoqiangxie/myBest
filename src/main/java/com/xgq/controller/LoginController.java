package com.xgq.controller;

import com.xgq.dto.*;
import com.xgq.restService.DocumentRestService;
import com.xgq.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: LoginController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class LoginController {

    @Autowired
    private DocumentService documentService;

    @Autowired
    private DocumentRestService documentRestService;

    @RequestMapping("login")
    public String login(HttpServletRequest request) {
        List documents = documentService.selectDocumentByName("englishName");
        QueryDto<QueryDucumentDto> queryDto = new QueryDto<QueryDucumentDto>();
        QueryDucumentDto queryDucumentDto = new QueryDucumentDto();
        queryDucumentDto.setName("YZ集团VMware虚拟化解决方案");
        queryDto.setCondition(queryDucumentDto);
        Pagination pagination = new Pagination();
        pagination.setPage(3);
        pagination.setRows(1);
        queryDto.setPagination(pagination);
        ResultDto<DocumentDto> documentDtoResultDto = documentRestService.query(queryDto);
        return "login";
    }
}

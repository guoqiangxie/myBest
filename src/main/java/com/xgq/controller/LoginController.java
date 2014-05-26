package com.xgq.controller;

import com.xgq.service.DocumentService;
import com.xgq.service.impl.DocumentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("login")
    public String login() {
        List documents = documentService.selectDocumentByName("englishName");
        return "login";
    }
}

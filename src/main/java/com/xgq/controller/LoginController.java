package com.xgq.controller;

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

    @RequestMapping("login")
    public String login(HttpServletRequest request) {
        List documents = documentService.selectDocumentByName("englishName");
        return "login";
    }
}

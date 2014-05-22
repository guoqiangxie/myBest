package com.xgq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("login")
    public String login() {
        return "login";
    }
}

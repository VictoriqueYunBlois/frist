package com.llk.demo.controller;

import com.llk.demo.common.BaseResult;
import com.llk.demo.common.BootstrapTable;
import com.llk.demo.model.School;
import com.llk.demo.model.User;
import com.llk.demo.service.SchoolService;
import com.llk.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
public class loginController {

    @Autowired
    private UserService userService;
    @Autowired
    private SchoolService schoolService;

    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/login.json")
    @ResponseBody
    public BaseResult recieveData(@RequestBody Map<String, Object> loginData){
//        Map<String, Object> map = new HashMap<>();
        BaseResult baseResult = new BaseResult();
        String loginName = loginData.get("loginName").toString();
        String loginPwd = loginData.get("loginPwd").toString();
       if (loginName != null){
           System.out.println(loginName);
           User user = userService.selByName(loginName);
           if (user.getPassWord().equals(loginPwd)){
               baseResult.setSuccess(true);
           }else {
               baseResult.setSuccess(false);
           }
       }
        return baseResult;
    }

    @RequestMapping(value = "/index.html")
    public String test(){
        return "index";
    }

    @RequestMapping("/test.html")
    public String table(){
        return "test";
    }
    /**
     * 注销页面
     *
     * @param request
     * @param response
     * @return
     */

    @RequestMapping(value = {"logout.html"})
    public String logout(HttpServletRequest request,
                         HttpServletResponse response) {

        //TODO: 从Session中删除用户信息

        return "login";

    }

}

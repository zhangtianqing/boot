package com.soft.boot.controller;

import com.soft.boot.domain.SysUser;
import com.soft.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class MultifunctionalController {

    @Autowired
    UserService userService;

    @GetMapping("/print")
    @ResponseBody
    public List<SysUser> print(){
        return userService.getList();
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}

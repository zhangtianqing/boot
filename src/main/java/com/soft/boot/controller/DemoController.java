package com.soft.boot.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping("/admin")
public class DemoController {

    @RequestMapping("/result")
    @ResponseBody
    public String test(@Param("id") String id){
        return "id ="+id;
    }
}

package com.lanjiabin.controller;

import com.lanjiabin.pojo.InfoPojo;
import com.lanjiabin.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    private InfoService service;

    //http://localhost/info/findUserName?username=蓝家彬
    @RequestMapping(value = "findUserName")
    public List<InfoPojo> findAllByUsername(@RequestParam(value = "username") String username){
        return service.findForPeople(username);
    }

}

package com.lanjiabin.controller;

import com.lanjiabin.pojo.UserInfoPojo;
import com.lanjiabin.repository.UserInfoRepository;
import com.lanjiabin.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    // http://localhost/user/all
    @GetMapping(value = "/all")
    public List<UserInfoPojo> getAll(){

        return userInfoService.findAll();
    }
    @GetMapping(value = "/all2")
    public void getpp(){
        System.out.println("============");
    }
}

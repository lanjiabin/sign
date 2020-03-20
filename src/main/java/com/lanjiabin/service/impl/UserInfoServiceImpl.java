package com.lanjiabin.service.impl;

import com.lanjiabin.pojo.UserInfoPojo;
import com.lanjiabin.repository.UserInfoRepository;
import com.lanjiabin.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoRepository service;
    @Override
    public List<UserInfoPojo> findAll() {
        return service.findAll();
    }

}

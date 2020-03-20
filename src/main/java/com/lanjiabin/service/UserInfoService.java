package com.lanjiabin.service;

import com.lanjiabin.pojo.UserInfoPojo;

import java.util.List;
import java.util.Map;

public interface UserInfoService {
    /**
     *
     * 查询全部数据
     * */
    List<UserInfoPojo> findAll();
}

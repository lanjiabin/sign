package com.lanjiabin.service.impl;

import com.lanjiabin.pojo.InfoPojo;
import com.lanjiabin.repository.InfoRepository;
import com.lanjiabin.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoRepository service;

    @Override
    public List<InfoPojo> findForPeople(String username) {
        return service.findForPeople(username);
    }
}

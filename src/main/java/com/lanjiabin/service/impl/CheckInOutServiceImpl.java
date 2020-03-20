package com.lanjiabin.service.impl;

import com.lanjiabin.pojo.CheckInOutPojo;
import com.lanjiabin.repository.CheckInOutRepository;
import com.lanjiabin.service.CheckInOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CheckInOutServiceImpl implements CheckInOutService {
    @Autowired
    private CheckInOutRepository service;
    @Override
    public List<CheckInOutPojo> findAll() {
        return service.findAll();
    }

    @Override
    public List<CheckInOutPojo> findAllByUserid(Integer userName, Pageable pageable) {
        return service.findAllByUserid(userName, pageable);
    }

    @Override
    public List<Map<String, Object>> findUserId(Integer id, String time) {
        return service.findForDay(id,time);
    }

    @Override
    public List<Map<String, Object>> findForYear(Integer id, String year) {
        return service.findForYear(id,year);
    }

    @Override
    public List<Map<String, Object>> findForMonths(Integer id, String months) {
        return service.findForMonths(id,months);
    }

}

package com.lanjiabin.service;

import com.lanjiabin.pojo.CheckInOutPojo;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface CheckInOutService {
    /**
     *
     * 查询全部数据
     * */
    List<CheckInOutPojo> findAll();
    List<CheckInOutPojo> findAllByUserid(Integer userName, Pageable pageable);
    List<Map<String, Object>> findUserId(Integer id, String time);
    List<Map<String,Object>> findForYear(Integer id,String year);
    List<Map<String,Object>> findForMonths(Integer id,String months);

}

package com.lanjiabin.service;

import com.lanjiabin.pojo.InfoPojo;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface InfoService {
//    List<InfoPojo> findByUsername(String username);
//    List<InfoPojo> findAllByUsername(String username);
//    List<InfoPojo> findForName(String username);

      List<InfoPojo> findForPeople(String username);
}

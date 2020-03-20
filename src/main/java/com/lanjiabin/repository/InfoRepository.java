package com.lanjiabin.repository;

import com.lanjiabin.pojo.InfoPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface InfoRepository extends JpaRepository<InfoPojo,Integer> {

    @Query(value = "select * from info where info.username=?1",nativeQuery = true)
    List<InfoPojo> findForPeople(@Param(value = "username") String username);


}

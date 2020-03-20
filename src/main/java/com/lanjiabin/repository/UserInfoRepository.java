package com.lanjiabin.repository;

import com.lanjiabin.pojo.UserInfoPojo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserInfoRepository extends JpaRepository<UserInfoPojo,Integer> {

}

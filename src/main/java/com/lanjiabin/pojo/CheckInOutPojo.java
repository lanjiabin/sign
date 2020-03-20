package com.lanjiabin.pojo;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "checkinout")
@IdClass(CheckInOutPrimaryKey.class)
public class CheckInOutPojo implements Serializable {
  private static final Long serialVersionUID = 1L;

  @Id
  @Column(name = "userid", nullable = false)
  private Integer userid;
  @Id
  @Column(name = "checktime", nullable = false)
  private java.sql.Timestamp checktime;
  private String checktype;
  private Integer verifycode;
  private String sensorid;
  private String memoinfo;
  private String workCode;
  private String sn;
  private Integer userExtFmt;


  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public java.sql.Timestamp getChecktime() {
    return checktime;
  }

  public void setChecktime(java.sql.Timestamp checktime) {
    this.checktime = checktime;
  }


  public String getChecktype() {
    return checktype;
  }

  public void setChecktype(String checktype) {
    this.checktype = checktype;
  }


  public Integer getVerifycode() {
    return verifycode;
  }

  public void setVerifycode(Integer verifycode) {
    this.verifycode = verifycode;
  }


  public String getSensorid() {
    return sensorid;
  }

  public void setSensorid(String sensorid) {
    this.sensorid = sensorid;
  }


  public String getMemoinfo() {
    return memoinfo;
  }

  public void setMemoinfo(String memoinfo) {
    this.memoinfo = memoinfo;
  }


  public String getWorkCode() {
    return workCode;
  }

  public void setWorkCode(String workCode) {
    this.workCode = workCode;
  }


  public String getSn() {
    return sn;
  }

  public void setSn(String sn) {
    this.sn = sn;
  }


  public Integer getUserExtFmt() {
    return userExtFmt;
  }

  public void setUserExtFmt(Integer userExtFmt) {
    this.userExtFmt = userExtFmt;
  }

}

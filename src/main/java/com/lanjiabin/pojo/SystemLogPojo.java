package com.lanjiabin.pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "systemlog")
public class SystemLogPojo implements Serializable {

  private static final Long serialVersionUID = 1L;
  @Id
  @GeneratedValue
  private Integer id;
  private String operator;
  private java.sql.Timestamp logTime;
  private String machineAlias;
  private Integer logTag;
  private String logDescr;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }


  public java.sql.Timestamp getLogTime() {
    return logTime;
  }

  public void setLogTime(java.sql.Timestamp logTime) {
    this.logTime = logTime;
  }


  public String getMachineAlias() {
    return machineAlias;
  }

  public void setMachineAlias(String machineAlias) {
    this.machineAlias = machineAlias;
  }


  public Integer getLogTag() {
    return logTag;
  }

  public void setLogTag(Integer logTag) {
    this.logTag = logTag;
  }


  public String getLogDescr() {
    return logDescr;
  }

  public void setLogDescr(String logDescr) {
    this.logDescr = logDescr;
  }

}

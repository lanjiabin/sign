package com.lanjiabin.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class CheckInOutPrimaryKey implements Serializable {
    private Integer userid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Timestamp getChecktime() {
        return checktime;
    }

    public void setChecktime(Timestamp checktime) {
        this.checktime = checktime;
    }

    private java.sql.Timestamp checktime;
}

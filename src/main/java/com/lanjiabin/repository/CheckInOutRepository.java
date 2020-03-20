package com.lanjiabin.repository;

import com.lanjiabin.pojo.CheckInOutPojo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface CheckInOutRepository  extends JpaRepository<CheckInOutPojo,Integer> {
    List<CheckInOutPojo> findAllByUserid(Integer userName, Pageable pageable);
    /**
     *
     * [
     *     {
     *         "worktime":"21:02:56",
     *         "singntime":"2019-09-02T14:01:35.000+0000",
     *         "userid":191,
     *         "name":"蓝家彬",
     *         "ymd":"2019-09-02"
     *     },
     *     {
     *         "worktime":"21:02:56",
     *         "userid":191,
     *         "name":"蓝家彬",
     *         "ymd":"2019-09-02",
     *         "singntime":"2019-09-02T23:04:31.000+0000"
     *     }
     * ]
     * */
    //输入ID、日期 2019-09-09
    @Query(value = "SELECT DATE_FORMAT(checkinout.CHECKTIME,'%Y-%m-%d') 'ymd',checkinout.USERID 'userid',userinfo.`Name` 'name',checkinout.CHECKTIME 'singntime',TIMEDIFF(TIMEDIFF(t2.singntime2,t1.singntime1),'02:00:00') as worktime FROM checkinout,userinfo,(SELECT checkinout.USERID 'myuserid',checkinout.CHECKTIME 'singntime1' FROM checkinout,userinfo WHERE checkinout.USERID=userinfo.USERID AND checkinout.USERID=?1 AND DATE_FORMAT(checkinout.CHECKTIME,'%Y-%m-%d')=?2 GROUP BY checkinout.CHECKTIME LIMIT 1) t1,(SELECT checkinout.USERID 'userid',checkinout.CHECKTIME 'singntime2' FROM checkinout,userinfo WHERE checkinout.USERID=userinfo.USERID AND checkinout.USERID=?1 AND DATE_FORMAT(checkinout.CHECKTIME,'%Y-%m-%d')=?2 GROUP BY checkinout.CHECKTIME DESC LIMIT 1) t2 WHERE checkinout.USERID=userinfo.USERID AND checkinout.USERID=?1 AND DATE_FORMAT(checkinout.CHECKTIME,'%Y-%m-%d')=?2 GROUP BY checkinout.CHECKTIME",nativeQuery = true)
    List<Map<String, Object>> findForDay(Integer id,String time);


    @Query(value = "SELECT DATE_FORMAT(checkinout.CHECKTIME,'%Y') 'year',checkinout.USERID 'userid',userinfo.`Name` 'name',checkinout.CHECKTIME 'signtime' FROM checkinout,userinfo WHERE checkinout.USERID=userinfo.USERID AND checkinout.USERID=?1 AND DATE_FORMAT(checkinout.CHECKTIME,'%Y')=?2 GROUP BY checkinout.CHECKTIME",nativeQuery = true)
    List<Map<String,Object>> findForYear(Integer id,String year);

    @Query(value = "SELECT DATE_FORMAT(checkinout.CHECKTIME,\"%Y-%m\") 'ym',checkinout.USERID 'userid',userinfo.`Name` 'name',checkinout.CHECKTIME 'singntime' FROM checkinout,userinfo WHERE checkinout.USERID=userinfo.USERID AND checkinout.USERID=?1 AND DATE_FORMAT(checkinout.CHECKTIME,\"%Y-%m\")=?2 GROUP BY checkinout.CHECKTIME",nativeQuery = true)
    List<Map<String,Object>> findForMonths(Integer id,String months);

}

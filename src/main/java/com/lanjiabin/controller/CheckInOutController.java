package com.lanjiabin.controller;

import com.lanjiabin.pojo.CheckInOutPojo;
import com.lanjiabin.service.CheckInOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/checkinout")
public class CheckInOutController {
    @Autowired
    private CheckInOutService service;

    @GetMapping(value = "/download")
    public List<CheckInOutPojo> findAll(){
        return service.findAll();
    }
    //http://localhost/checkinout/pageOne?id=191&page=0&size=10
    @GetMapping(value = "/pageOne")
    public  List<CheckInOutPojo> pageOne(@RequestParam(value = "id") Integer id,@RequestParam(value = "page") Integer page,@RequestParam(value = "size") Integer size){
        return service.findAllByUserid(id, PageRequest.of(page,size));
    }

    // http://localhost/checkinout/oneDay?id=191&time=2019-09-16
    @GetMapping(value = "oneDay")
    public List<Map<String, Object>> oneDay(@RequestParam(value = "id") Integer id,@RequestParam(value = "time") String time){
        return service.findUserId(id,time);
    }

    //http://localhost/checkinout/oneYear?id=191&year=2019
    @GetMapping(value = "oneYear")
    public List<Map<String, Object>> oneYear(@RequestParam(value = "id") Integer id,@RequestParam(value = "year") String year){
        return service.findForYear(id,year);
    }

    //http://localhost/checkinout/oneMonths?id=191&months=2019-09
    @GetMapping(value = "oneMonths")
    public List<Map<String, Object>> oneMonths(@RequestParam(value = "id") Integer id,@RequestParam(value = "months") String months){
        return service.findForMonths(id,months);
    }


}

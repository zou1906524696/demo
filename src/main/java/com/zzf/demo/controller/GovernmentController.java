package com.zzf.demo.controller;

import com.zzf.demo.service.IGovernmentService;
import com.zzf.demo.vo.GovernmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GovernmentController {

    @Autowired
    private IGovernmentService iGovernmentService;

    @RequestMapping("/hello")
    public Map hello(){
        Map map = new HashMap();
        List<GovernmentVo> list = iGovernmentService.selectByOrgId();
        map.put("info",list);
        return map;
    }

}

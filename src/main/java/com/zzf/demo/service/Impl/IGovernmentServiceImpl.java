package com.zzf.demo.service.Impl;


import com.zzf.demo.mapper.GovernmentMapper;
import com.zzf.demo.service.IGovernmentService;
import com.zzf.demo.vo.GovernmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IGovernmentServiceImpl implements IGovernmentService {
    @Autowired
    private GovernmentMapper governmentMapper;

    @Override
    public List<GovernmentVo> selectByOrgId() {
        return governmentMapper.countByOrgId();
    }

}

package com.zzf.demo.service;

import com.zzf.demo.vo.GovernmentVo;
import java.util.List;

public interface IGovernmentService {
    List<GovernmentVo> selectByOrgId();
}

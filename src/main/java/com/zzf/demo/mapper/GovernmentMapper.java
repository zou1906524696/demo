package com.zzf.demo.mapper;

import com.zzf.demo.vo.GovernmentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GovernmentMapper {

    List<GovernmentVo> countByOrgId();
}

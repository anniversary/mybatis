package com.edc.zsy.mapper;

import com.edc.zsy.entity.PanMemberInfo;

public interface PanMemberInfoMapper {
    int deleteByPrimaryKey(Integer fanMemberId);

    int insert(PanMemberInfo record);

    int insertSelective(PanMemberInfo record);

    PanMemberInfo selectByPrimaryKey(Integer fanMemberId);

    int updateByPrimaryKeySelective(PanMemberInfo record);

    int updateByPrimaryKey(PanMemberInfo record);
}
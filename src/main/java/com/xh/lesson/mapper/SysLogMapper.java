package com.xh.lesson.mapper;

import com.xh.lesson.entity.SysLog;
import com.xh.lesson.vo.req.SysLogPageReqVO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);

    List<SysLog> selectAll(SysLogPageReqVO vo);

    void batchDeletedLog(List<String> logIds);
}
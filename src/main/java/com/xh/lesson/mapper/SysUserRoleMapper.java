package com.xh.lesson.mapper;

import com.xh.lesson.entity.SysUserRole;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysUserRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);

    int removeByRoleId(String roleId);

    List<String> getRoleIdsByUserId(String userId);

    int batchUserRole(List<SysUserRole> list);

    int removeByUserId(String userId);

    List<String> getInfoByUserIdByRoleId( String roleId);

    List<String> getUserIdsByRoleIds(List<String> roleIds);

}
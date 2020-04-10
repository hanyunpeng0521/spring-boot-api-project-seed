package com.company.project.persistence.mapper;


import com.company.project.framework.shiro.rule.RolePermRule;
import com.company.project.persistence.beans.SysRolePermission;
import com.company.project.plugin.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author pingxin
 * @since 2020-03-03
 */
public interface SysRolePermissionMapper extends BaseMapper<SysRolePermission> {


    int removeByRoleId(Long roleId);

    List<Long> getPermissionIdsByRoles(List<Long> roleIds);

    int batchRolePermission(List<SysRolePermission> list);

    int removeByPermissionId(Long permissionId);

    List<Long> getRoleIds(Long permissionId);

    List<Long> getPermissionIdsByRoleId(Long roleId);

    List<RolePermRule> selectRoleRules(@Param("type") Integer type) throws DataAccessException;

}
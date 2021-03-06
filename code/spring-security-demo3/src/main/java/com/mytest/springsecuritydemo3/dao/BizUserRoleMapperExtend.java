/* https://github.com/orange1438 */
package com.mytest.springsecuritydemo3.dao;

import com.mytest.springsecuritydemo3.dao.auto.BizUserRoleMapper;
import com.mytest.springsecuritydemo3.model.dto.UserPermissionDTO;

import javax.annotation.Resource;

/**
 * 本文件由 https://github.com/orange1438/mybatis-generator-core-chinese-annotation1.3.5-chinese-annotation 自动生成
 *
 * @author orange1438 code generator
 */
@Resource
public interface BizUserRoleMapperExtend extends BizUserRoleMapper {

    UserPermissionDTO selectUserByUserName(String userName);
}
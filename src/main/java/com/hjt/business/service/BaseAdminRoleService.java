package com.hjt.business.service;

import com.hjt.business.entity.BaseAdminRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
* <p>
* 系统用户角色表 服务类
* </p>
*
* @author hjt
* @since 2022-12-27
*/
public interface BaseAdminRoleService {

    /**
    * 分页查询BaseAdminRole
    *
    * @param page     当前页数
    * @param pageSize 页的大小
    * @param factor  搜索关键词
    * @return 返回mybatis-plus的Page对象,其中records字段为符合条件的查询结果
    * @author hjt
    * @since 2022-12-27
    */
    Page<BaseAdminRole> listBaseAdminRolesByPage(int page, int pageSize, BaseAdminRole factor);

    /**
    * 根据id查询BaseAdminRole
    *
    * @param id 需要查询的BaseAdminRole的id
    * @return 返回对应id的BaseAdminRole对象
    * @author hjt
    * @since 2022-12-27
    */
    BaseAdminRole getBaseAdminRoleById(Long id);

    /**
    * 插入BaseAdminRole
    *
    * @param baseAdminRole 需要插入的BaseAdminRole对象
    * @return 返回插入成功之后BaseAdminRole对象的id
    * @author hjt
    * @since 2022-12-27
    */
    Long insertBaseAdminRole(BaseAdminRole baseAdminRole);

    /**
    * 根据id删除BaseAdminRole
    *
    * @param id 需要删除的BaseAdminRole对象的id
    * @return 返回被删除的BaseAdminRole对象的id
    * @author hjt
    * @since 2022-12-27
    */
    Long deleteBaseAdminRoleById(Long id);

    /**
    * 根据id更新BaseAdminRole
    *
    * @param baseAdminRole 需要更新的BaseAdminRole对象
    * @return 返回被更新的BaseAdminRole对象的id
    * @author hjt
    * @since 2022-12-27
    */
    Long updateBaseAdminRole(BaseAdminRole baseAdminRole);

}

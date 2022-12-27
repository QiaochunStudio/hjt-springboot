package com.hjt.business.service;

import com.hjt.business.entity.BaseAdminPermission;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
* <p>
*  服务类
* </p>
*
* @author hjt
* @since 2022-12-27
*/
public interface BaseAdminPermissionService {

    /**
    * 分页查询BaseAdminPermission
    *
    * @param page     当前页数
    * @param pageSize 页的大小
    * @param factor  搜索关键词
    * @return 返回mybatis-plus的Page对象,其中records字段为符合条件的查询结果
    * @author hjt
    * @since 2022-12-27
    */
    Page<BaseAdminPermission> listBaseAdminPermissionsByPage(int page, int pageSize, BaseAdminPermission factor);

    /**
    * 根据id查询BaseAdminPermission
    *
    * @param id 需要查询的BaseAdminPermission的id
    * @return 返回对应id的BaseAdminPermission对象
    * @author hjt
    * @since 2022-12-27
    */
    BaseAdminPermission getBaseAdminPermissionById(Long id);

    /**
    * 插入BaseAdminPermission
    *
    * @param baseAdminPermission 需要插入的BaseAdminPermission对象
    * @return 返回插入成功之后BaseAdminPermission对象的id
    * @author hjt
    * @since 2022-12-27
    */
    Long insertBaseAdminPermission(BaseAdminPermission baseAdminPermission);

    /**
    * 根据id删除BaseAdminPermission
    *
    * @param id 需要删除的BaseAdminPermission对象的id
    * @return 返回被删除的BaseAdminPermission对象的id
    * @author hjt
    * @since 2022-12-27
    */
    Long deleteBaseAdminPermissionById(Long id);

    /**
    * 根据id更新BaseAdminPermission
    *
    * @param baseAdminPermission 需要更新的BaseAdminPermission对象
    * @return 返回被更新的BaseAdminPermission对象的id
    * @author hjt
    * @since 2022-12-27
    */
    Long updateBaseAdminPermission(BaseAdminPermission baseAdminPermission);

}

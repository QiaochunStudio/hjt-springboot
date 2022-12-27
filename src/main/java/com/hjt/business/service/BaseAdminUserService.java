package com.hjt.business.service;

import com.hjt.business.entity.BaseAdminUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
* <p>
* 系统管理员帐号 服务类
* </p>
*
* @author hjt
* @since 2022-12-27
*/
public interface BaseAdminUserService {

    /**
    * 分页查询BaseAdminUser
    *
    * @param page     当前页数
    * @param pageSize 页的大小
    * @param factor  搜索关键词
    * @return 返回mybatis-plus的Page对象,其中records字段为符合条件的查询结果
    * @author hjt
    * @since 2022-12-27
    */
    Page<BaseAdminUser> listBaseAdminUsersByPage(int page, int pageSize, BaseAdminUser factor);

    /**
    * 根据id查询BaseAdminUser
    *
    * @param id 需要查询的BaseAdminUser的id
    * @return 返回对应id的BaseAdminUser对象
    * @author hjt
    * @since 2022-12-27
    */
    BaseAdminUser getBaseAdminUserById(Long id);

    /**
    * 插入BaseAdminUser
    *
    * @param baseAdminUser 需要插入的BaseAdminUser对象
    * @return 返回插入成功之后BaseAdminUser对象的id
    * @author hjt
    * @since 2022-12-27
    */
    Long insertBaseAdminUser(BaseAdminUser baseAdminUser);

    /**
    * 根据id删除BaseAdminUser
    *
    * @param id 需要删除的BaseAdminUser对象的id
    * @return 返回被删除的BaseAdminUser对象的id
    * @author hjt
    * @since 2022-12-27
    */
    Long deleteBaseAdminUserById(Long id);

    /**
    * 根据id更新BaseAdminUser
    *
    * @param baseAdminUser 需要更新的BaseAdminUser对象
    * @return 返回被更新的BaseAdminUser对象的id
    * @author hjt
    * @since 2022-12-27
    */
    Long updateBaseAdminUser(BaseAdminUser baseAdminUser);

}

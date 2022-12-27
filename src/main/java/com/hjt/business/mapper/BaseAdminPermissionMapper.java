package com.hjt.business.mapper;

import com.hjt.business.entity.BaseAdminPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
* <p>
*  Mapper 接口
* </p>
*
* @author hjt
* @since 2022-12-27
*/
@Mapper
@Repository
public interface BaseAdminPermissionMapper extends BaseMapper<BaseAdminPermission> {

}

package com.hjt.business.mapper;

import com.hjt.business.entity.BaseAdminUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
* <p>
* 系统管理员帐号 Mapper 接口
* </p>
*
* @author hjt
* @since 2022-12-27
*/
@Mapper
@Repository
public interface BaseAdminUserMapper extends BaseMapper<BaseAdminUser> {

}

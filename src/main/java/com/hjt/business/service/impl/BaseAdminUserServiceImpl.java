package com.hjt.business.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjt.business.entity.BaseAdminUser;
import com.hjt.business.mapper.BaseAdminUserMapper;
import com.hjt.business.service.BaseAdminUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
* <p>
* 系统管理员帐号 服务实现类
* </p>
*
* @author hjt
* @since 2022-12-27
*/
@Slf4j
@Service
@Transactional
public class BaseAdminUserServiceImpl extends ServiceImpl<BaseAdminUserMapper, BaseAdminUser> implements BaseAdminUserService {

    @Override
    public Page<BaseAdminUser> listBaseAdminUsersByPage(int page, int pageSize, BaseAdminUser factor) {
        log.info("正在执行分页查询baseAdminUser: page = {} pageSize = {} factor = {}",page,pageSize,factor);
        LambdaQueryWrapper<BaseAdminUser> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        //TODO 这里需要自定义用于匹配的字段,并把wrapper传入下面的page方法
        //模糊查询例子
       //lambdaQueryWrapper.like(SysUser::getNickName,factor);
        //也可以实体类进行模糊查询
        //QueryWrapper<BaseAdminUser>likeQueryWrapper = ConditionsUtil.getLikeQueryWrapper(factor);
        //Page<BaseAdminUser> result = super.page(new Page<>(page, pageSize),lambdaQueryWrapper);
        Page<BaseAdminUser> result = super.page(new Page<>(page, pageSize));
        log.info("分页查询baseAdminUser完毕: 结果数 = {} ",result.getRecords().size());
        return result;
    }

    @Override
    public BaseAdminUser getBaseAdminUserById(Long id) {
        log.info("正在查询baseAdminUser中id为{}的数据",id);
        BaseAdminUser baseAdminUser = super.getById(id);
        log.info("查询id为{}的baseAdminUser{}",id,(null == baseAdminUser?"无结果":"成功"));
        return baseAdminUser;
    }

    @Override
    public Long insertBaseAdminUser(BaseAdminUser baseAdminUser) {
        log.info("正在插入baseAdminUser");
        if (super.save(baseAdminUser)) {
            log.info("插入baseAdminUser成功,id为{}",baseAdminUser.getId());
            return baseAdminUser.getId();
        } else {
            log.error("插入baseAdminUser失败");
            throw new RuntimeException("添加失败");
        }
    }

    @Override
    public Long deleteBaseAdminUserById(Long id) {
        log.info("正在删除id为{}的baseAdminUser",id);
        if (super.removeById(id)) {
            log.info("删除id为{}的baseAdminUser成功",id);
            return id;
        } else {
            log.error("删除id为{}的baseAdminUser失败",id);
            throw new RuntimeException("删除失败[id=" + id + "]");
        }
    }

    @Override
    public Long updateBaseAdminUser(BaseAdminUser baseAdminUser) {
        log.info("正在更新id为{}的baseAdminUser",baseAdminUser.getId());
        if (super.updateById(baseAdminUser)) {
            log.info("更新d为{}的baseAdminUser成功",baseAdminUser.getId());
            return baseAdminUser.getId();
        } else {
            log.error("更新id为{}的baseAdminUser失败",baseAdminUser.getId());
            throw new RuntimeException("更新失败[id=" + baseAdminUser.getId() + "]");
        }
    }

}

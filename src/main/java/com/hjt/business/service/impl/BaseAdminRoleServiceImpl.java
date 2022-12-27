package com.hjt.business.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjt.business.entity.BaseAdminRole;
import com.hjt.business.mapper.BaseAdminRoleMapper;
import com.hjt.business.service.BaseAdminRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
* <p>
* 系统用户角色表 服务实现类
* </p>
*
* @author hjt
* @since 2022-12-27
*/
@Slf4j
@Service
@Transactional
public class BaseAdminRoleServiceImpl extends ServiceImpl<BaseAdminRoleMapper, BaseAdminRole> implements BaseAdminRoleService {

    @Override
    public Page<BaseAdminRole> listBaseAdminRolesByPage(int page, int pageSize, BaseAdminRole factor) {
        log.info("正在执行分页查询baseAdminRole: page = {} pageSize = {} factor = {}",page,pageSize,factor);
        LambdaQueryWrapper<BaseAdminRole> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        //TODO 这里需要自定义用于匹配的字段,并把wrapper传入下面的page方法
        //模糊查询例子
       //lambdaQueryWrapper.like(SysUser::getNickName,factor);
        //也可以实体类进行模糊查询
        //QueryWrapper<BaseAdminRole>likeQueryWrapper = ConditionsUtil.getLikeQueryWrapper(factor);
        //Page<BaseAdminRole> result = super.page(new Page<>(page, pageSize),lambdaQueryWrapper);
        Page<BaseAdminRole> result = super.page(new Page<>(page, pageSize));
        log.info("分页查询baseAdminRole完毕: 结果数 = {} ",result.getRecords().size());
        return result;
    }

    @Override
    public BaseAdminRole getBaseAdminRoleById(Long id) {
        log.info("正在查询baseAdminRole中id为{}的数据",id);
        BaseAdminRole baseAdminRole = super.getById(id);
        log.info("查询id为{}的baseAdminRole{}",id,(null == baseAdminRole?"无结果":"成功"));
        return baseAdminRole;
    }

    @Override
    public Long insertBaseAdminRole(BaseAdminRole baseAdminRole) {
        log.info("正在插入baseAdminRole");
        if (super.save(baseAdminRole)) {
            log.info("插入baseAdminRole成功,id为{}",baseAdminRole.getId());
            return baseAdminRole.getId();
        } else {
            log.error("插入baseAdminRole失败");
            throw new RuntimeException("添加失败");
        }
    }

    @Override
    public Long deleteBaseAdminRoleById(Long id) {
        log.info("正在删除id为{}的baseAdminRole",id);
        if (super.removeById(id)) {
            log.info("删除id为{}的baseAdminRole成功",id);
            return id;
        } else {
            log.error("删除id为{}的baseAdminRole失败",id);
            throw new RuntimeException("删除失败[id=" + id + "]");
        }
    }

    @Override
    public Long updateBaseAdminRole(BaseAdminRole baseAdminRole) {
        log.info("正在更新id为{}的baseAdminRole",baseAdminRole.getId());
        if (super.updateById(baseAdminRole)) {
            log.info("更新d为{}的baseAdminRole成功",baseAdminRole.getId());
            return baseAdminRole.getId();
        } else {
            log.error("更新id为{}的baseAdminRole失败",baseAdminRole.getId());
            throw new RuntimeException("更新失败[id=" + baseAdminRole.getId() + "]");
        }
    }

}

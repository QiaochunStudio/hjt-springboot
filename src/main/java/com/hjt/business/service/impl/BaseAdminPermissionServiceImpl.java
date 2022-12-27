package com.hjt.business.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjt.business.entity.BaseAdminPermission;
import com.hjt.business.mapper.BaseAdminPermissionMapper;
import com.hjt.business.service.BaseAdminPermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
* <p>
*  服务实现类
* </p>
*
* @author hjt
* @since 2022-12-27
*/
@Slf4j
@Service
@Transactional
public class BaseAdminPermissionServiceImpl extends ServiceImpl<BaseAdminPermissionMapper, BaseAdminPermission> implements BaseAdminPermissionService {

    @Override
    public Page<BaseAdminPermission> listBaseAdminPermissionsByPage(int page, int pageSize, BaseAdminPermission factor) {
        log.info("正在执行分页查询baseAdminPermission: page = {} pageSize = {} factor = {}",page,pageSize,factor);
        LambdaQueryWrapper<BaseAdminPermission> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        //TODO 这里需要自定义用于匹配的字段,并把wrapper传入下面的page方法
        //模糊查询例子
       //lambdaQueryWrapper.like(SysUser::getNickName,factor);
        //也可以实体类进行模糊查询
        //QueryWrapper<BaseAdminPermission>likeQueryWrapper = ConditionsUtil.getLikeQueryWrapper(factor);
        //Page<BaseAdminPermission> result = super.page(new Page<>(page, pageSize),lambdaQueryWrapper);
        Page<BaseAdminPermission> result = super.page(new Page<>(page, pageSize));
        log.info("分页查询baseAdminPermission完毕: 结果数 = {} ",result.getRecords().size());
        return result;
    }

    @Override
    public BaseAdminPermission getBaseAdminPermissionById(Long id) {
        log.info("正在查询baseAdminPermission中id为{}的数据",id);
        BaseAdminPermission baseAdminPermission = super.getById(id);
        log.info("查询id为{}的baseAdminPermission{}",id,(null == baseAdminPermission?"无结果":"成功"));
        return baseAdminPermission;
    }

    @Override
    public Long insertBaseAdminPermission(BaseAdminPermission baseAdminPermission) {
        log.info("正在插入baseAdminPermission");
        if (super.save(baseAdminPermission)) {
            log.info("插入baseAdminPermission成功,id为{}",baseAdminPermission.getId());
            return baseAdminPermission.getId();
        } else {
            log.error("插入baseAdminPermission失败");
            throw new RuntimeException("添加失败");
        }
    }

    @Override
    public Long deleteBaseAdminPermissionById(Long id) {
        log.info("正在删除id为{}的baseAdminPermission",id);
        if (super.removeById(id)) {
            log.info("删除id为{}的baseAdminPermission成功",id);
            return id;
        } else {
            log.error("删除id为{}的baseAdminPermission失败",id);
            throw new RuntimeException("删除失败[id=" + id + "]");
        }
    }

    @Override
    public Long updateBaseAdminPermission(BaseAdminPermission baseAdminPermission) {
        log.info("正在更新id为{}的baseAdminPermission",baseAdminPermission.getId());
        if (super.updateById(baseAdminPermission)) {
            log.info("更新d为{}的baseAdminPermission成功",baseAdminPermission.getId());
            return baseAdminPermission.getId();
        } else {
            log.error("更新id为{}的baseAdminPermission失败",baseAdminPermission.getId());
            throw new RuntimeException("更新失败[id=" + baseAdminPermission.getId() + "]");
        }
    }

}

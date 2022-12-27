package com.hjt.business.controller;

import com.hjt.business.entity.BaseAdminRole;
import com.hjt.business.service.BaseAdminRoleService;
import com.hjt.exception.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * <p>
 * 系统用户角色表 前端控制器
 * </p>
 *
 * @author hjt
 * @since 2022-12-27
 * @version v1.0
 */
@RestController
@Api(value = "BaseAdminRole控制类", tags = {"BaseAdminRole控制类"})
@RequestMapping("/business/api/v1/base-admin-role")
public class BaseAdminRoleController {

    @Resource
    private BaseAdminRoleService baseAdminRoleService;

    /**
    * 查询分页数据
    */
    @ApiOperation(value = "BaseAdminRole查询分页")
    @RequestMapping(method = RequestMethod.GET)
    public AjaxResult listByPage(
    @RequestParam(value = "page",defaultValue = "10")int page,
    @RequestParam(value = "pageSize",defaultValue = "10")int pageSize,BaseAdminRole factor) {
        return AjaxResult.success(baseAdminRoleService.listBaseAdminRolesByPage(page, pageSize,factor));
    }


    /**
    * 根据id查询
    */
    @ApiOperation(value = "BaseAdminRole根据id查询")
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public AjaxResult getById(@PathVariable("id") Long id) {
        return AjaxResult.success(baseAdminRoleService.getBaseAdminRoleById(id));
    }

    /**
    * 新增
    */
    @ApiOperation(value = "BaseAdminRole新增")
    @RequestMapping(method = RequestMethod.POST)
    public AjaxResult insert(@RequestBody BaseAdminRole baseAdminRole) {
        return AjaxResult.success(baseAdminRoleService.insertBaseAdminRole(baseAdminRole));
    }

    /**
    * 删除
    */
    @ApiOperation(value = "BaseAdminRole根据id删除")
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public AjaxResult deleteById(@PathVariable("id") Long id) {
        return AjaxResult.success(baseAdminRoleService.deleteBaseAdminRoleById(id));
    }

    /**
    * 修改
    */
    @ApiOperation(value = "BaseAdminRole修改")
    @RequestMapping(method = RequestMethod.PUT)
    public AjaxResult updateById(@RequestBody BaseAdminRole baseAdminRole) {
        return AjaxResult.success(baseAdminRoleService.updateBaseAdminRole(baseAdminRole));
    }
}

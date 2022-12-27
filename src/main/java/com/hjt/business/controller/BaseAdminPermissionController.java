package com.hjt.business.controller;
import com.hjt.exception.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import com.hjt.business.service.BaseAdminPermissionService;
import com.hjt.business.entity.BaseAdminPermission;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hjt
 * @since 2022-12-27
 * @version v1.0
 */
@RestController
@Api(value = "BaseAdminPermission控制类", tags = {"BaseAdminPermission控制类"})
@RequestMapping("/business/api/v1/base-admin-permission")
public class BaseAdminPermissionController {

    @Resource
    private BaseAdminPermissionService baseAdminPermissionService;

    /**
    * 查询分页数据
    */
    @ApiOperation(value = "BaseAdminPermission查询分页")
    @RequestMapping(method = RequestMethod.GET)
    public AjaxResult listByPage(
    @RequestParam(value = "page",defaultValue = "10")int page,
    @RequestParam(value = "pageSize",defaultValue = "10")int pageSize,BaseAdminPermission factor) {
        return AjaxResult.success(baseAdminPermissionService.listBaseAdminPermissionsByPage(page, pageSize,factor));
    }


    /**
    * 根据id查询
    */
    @ApiOperation(value = "BaseAdminPermission根据id查询")
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public AjaxResult getById(@PathVariable("id") Long id) {
        return AjaxResult.success(baseAdminPermissionService.getBaseAdminPermissionById(id));
    }

    /**
    * 新增
    */
    @ApiOperation(value = "BaseAdminPermission新增")
    @RequestMapping(method = RequestMethod.POST)
    public AjaxResult insert(@RequestBody BaseAdminPermission baseAdminPermission) {
        return AjaxResult.success(baseAdminPermissionService.insertBaseAdminPermission(baseAdminPermission));
    }

    /**
    * 删除
    */
    @ApiOperation(value = "BaseAdminPermission根据id删除")
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public AjaxResult deleteById(@PathVariable("id") Long id) {
        return AjaxResult.success(baseAdminPermissionService.deleteBaseAdminPermissionById(id));
    }

    /**
    * 修改
    */
    @ApiOperation(value = "BaseAdminPermission修改")
    @RequestMapping(method = RequestMethod.PUT)
    public AjaxResult updateById(@RequestBody BaseAdminPermission baseAdminPermission) {
        return AjaxResult.success(baseAdminPermissionService.updateBaseAdminPermission(baseAdminPermission));
    }
}

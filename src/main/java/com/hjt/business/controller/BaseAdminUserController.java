package com.hjt.business.controller;
import com.hjt.exception.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import com.hjt.business.service.BaseAdminUserService;
import com.hjt.business.entity.BaseAdminUser;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


/**
 * <p>
 * 系统管理员帐号 前端控制器
 * </p>
 *
 * @author hjt
 * @since 2022-12-27
 * @version v1.0
 */
@RestController
@Api(value = "BaseAdminUser控制类", tags = {"BaseAdminUser控制类"})
@RequestMapping("/business/api/v1/base-admin-user")
public class BaseAdminUserController {

    @Resource
    private BaseAdminUserService baseAdminUserService;

    /**
    * 查询分页数据
    */
    @ApiOperation(value = "BaseAdminUser查询分页")
    @RequestMapping(method = RequestMethod.GET)
    public AjaxResult listByPage(
    @RequestParam(value = "page",defaultValue = "10")int page,
    @RequestParam(value = "pageSize",defaultValue = "10")int pageSize,BaseAdminUser factor) {
        return AjaxResult.success(baseAdminUserService.listBaseAdminUsersByPage(page, pageSize,factor));
    }


    /**
    * 根据id查询
    */
    @ApiOperation(value = "BaseAdminUser根据id查询")
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public AjaxResult getById(@PathVariable("id") Long id) {
        return AjaxResult.success(baseAdminUserService.getBaseAdminUserById(id));
    }

    /**
    * 新增
    */
    @ApiOperation(value = "BaseAdminUser新增")
    @RequestMapping(method = RequestMethod.POST)
    public AjaxResult insert(@RequestBody BaseAdminUser baseAdminUser) {
        return AjaxResult.success(baseAdminUserService.insertBaseAdminUser(baseAdminUser));
    }

    /**
    * 删除
    */
    @ApiOperation(value = "BaseAdminUser根据id删除")
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public AjaxResult deleteById(@PathVariable("id") Long id) {
        return AjaxResult.success(baseAdminUserService.deleteBaseAdminUserById(id));
    }

    /**
    * 修改
    */
    @ApiOperation(value = "BaseAdminUser修改")
    @RequestMapping(method = RequestMethod.PUT)
    public AjaxResult updateById(@RequestBody BaseAdminUser baseAdminUser) {
        return AjaxResult.success(baseAdminUserService.updateBaseAdminUser(baseAdminUser));
    }
}

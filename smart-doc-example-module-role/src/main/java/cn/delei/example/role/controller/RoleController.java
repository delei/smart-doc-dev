package cn.delei.example.role.controller;

import cn.delei.example.common.Result;
import cn.delei.example.role.model.Role;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * Role
 * @author deleiguo
 * @Order 3
 */
@RestController
@RequestMapping(value = "/role")
public class RoleController {
    /**
     * 根据主键ID获取信息
     *
     * @param id 主键ID
     * @return Result<Department> 结果对象
     */
    @GetMapping("/info/{id}")
    public Result<Role> selectById(@PathVariable("id") String id) {
        return Result.success();
    }

    /**
     * 保存
     *
     * @param data 信息数据
     * @return Result 结果
     */
    @PostMapping("/save")
    public Result save(Role data) {
        return Result.success();
    }

    /**
     * 删除
     *
     * @param id 主键ID
     * @return Result 结果
     */
    @PostMapping("/deleteById")
    public Result deleteById(String id) {
        return Result.success();
    }
}

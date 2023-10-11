package cn.delei.example.department.controller;

import cn.delei.example.common.Result;
import cn.delei.example.department.model.Department;
import org.springframework.web.bind.annotation.*;

/**
 * Department
 * @author deleiguo
 */
@RestController
@RequestMapping(value = "/dept")
public class DepartmentController {
    /**
     * 根据主键ID获取信息
     *
     * @param id 主键ID
     * @return Result<Department> 结果对象
     */
    @GetMapping("/info/{id}")
    public Result<Department> selectById(@PathVariable("id") String id) {
        return Result.success();
    }

    /**
     * 保存
     *
     * @param data 信息数据
     * @return Result 结果
     */
    @PostMapping("/save")
    public Result save(Department data) {
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

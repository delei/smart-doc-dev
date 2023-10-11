package cn.delei.example.user.controller;

import cn.delei.example.common.Result;
import cn.delei.example.user.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

/**
 * 用户基础
 * @author deleiguo
 */
@RestController
@RequestMapping(value = "/user/base")
public class UserBaseController {
    /**
     * 根据主键ID获取信息
     *
     * @param id 主键ID
     * @return Result<Department> 结果对象
     */
    @GetMapping("/info/{id}")
    public Result<User> selectById(@PathVariable("id") String id) {
        return Result.success();
    }

    /**
     * 保存
     *
     * @param data 信息数据
     * @return Result 结果
     */
    @PostMapping("/save")
    public Result save(User data) {
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

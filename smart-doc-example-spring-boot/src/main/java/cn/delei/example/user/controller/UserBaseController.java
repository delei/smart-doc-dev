package cn.delei.example.user.controller;

import cn.delei.example.common.Result;
import cn.delei.example.user.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserInfoController {
    /**
     * 根据用户ID获取用户信息
     *
     * @param id 用户ID
     * @return Result<User> 用户对象
     */
    @GetMapping("/info/{id}")
    public Result<User> selectUserById(@PathVariable("id") String id) {
        return Result.success();
    }


    /**
     * 保存用户
     *
     * @param user 用户数据
     * @return Result 结果
     */
    @PostMapping("/save")
    public Result saveUser(User user) {
        return Result.success();
    }

    /**
     * 删除用户
     *
     * @param id 主键ID
     * @return Result 结果
     */
    @PostMapping("/delete")

    public Result deleteUserById(String id) {
        return Result.success();
    }

    /**
     * 修改用户密码之前确认当前密码是否匹配
     *
     * @param id              用户ID
     * @param currentPassword 当前密码
     * @return Result 结果
     */
    @PostMapping("/confirmPwd")
    public Result confirmPwd(String id, String currentPassword) {
        return Result.success();
    }

    /**
     * 修改用户密码(用户维护)
     *
     * @param id          用户ID
     * @param newPassword 新密码
     * @return Result
     */
    @PostMapping("/editPwd")
    public Result editPwd(String id, String newPassword) {
        return Result.success();
    }

    /**
     * 重置用户默认密码
     *
     * @param id 用户ID
     * @return Result
     */
    @PostMapping("/resetPwd")
    public Result resetPwd(String id) {
        return Result.success();
    }
}

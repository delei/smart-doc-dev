package cn.delei.example.user.controller;

import cn.delei.example.common.Result;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 用户信息
 * @author deleiguo
 */
@RestController
@RequestMapping(value = "/user/info")
public class UserInfoController {

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


    /**
     * File upload
     * @param file 文件
     */
    @PostMapping("upload")
    public void upload(@RequestParam MultipartFile file, HttpRequest request) {

    }
}

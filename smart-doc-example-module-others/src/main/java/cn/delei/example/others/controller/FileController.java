package cn.delei.example.others.controller;

import cn.delei.example.common.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 文件上传
 * @author deleiguo
 * @Order 2
 */
@RestController
@RequestMapping(value = "/file")
public class FileController {
    /**
     * 上传单个文件V1
     * @param userId 用户id
     * @param file 文件
     * @return
     */
    @PostMapping(value = "/upload",consumes = "multipart/form-data")
    public void upload(String userId,@RequestParam MultipartFile file) {

    }

    /**
     * 上传单个文件V2
     * @param userId
     * @param userData
     * @param file
     * @return
     */
    @PostMapping("upload2")
    public Result formData2(String userId,@RequestParam String userData, MultipartFile file){
        return Result.success();
    }

    /**
     * 批量上传文件
     * @param file 文件
     * @return
     */
    @PostMapping(name = "/batchUpload1",consumes = "multipart/form-data")
    public Result batchFileUpload1(MultipartFile[] file) {
        return Result.success();
    }

    /**
     * 批量上传文件1
     * @param file 文件
     * @return
     */
    @PostMapping(value = "/batchUpload2",consumes = "multipart/form-data")
    public Result batchFileUpload2(List<MultipartFile> file) {
        return Result.success();
    }

}

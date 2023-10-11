package cn.delei.example.common;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Optional;

/**
 * 统一返回结果
 *
 * @author deleiguo
 * @param <T>
 */
@Getter
@ToString
public class Result<T> implements Serializable {
    /**
     * 信息(一般错误信息才使用)
     */
    private String message;

    /**
     * 信息状态码
     */
    private String messageCode;

    /**
     * 结果状态码(必须有值)
     */
    private String resultCode;

    /**
     * 数据
     */
    private T data;

    /**
     * 是否成功
     */
    private Boolean successResponse = Boolean.FALSE;

    /**
     * 私有无参构造方法，避免new操作
     */
    private Result() {
    }

    /**
     * 私有全属性构造方法，避免new操作
     *
     * @param resultCode      结果状态码
     * @param messageCode     信息状态码
     * @param message         信息
     * @param data            数据
     * @param successResponse 是否成功
     */
    private Result(String resultCode, String messageCode, String message, T data, Boolean successResponse) {
        this.resultCode = resultCode;
        this.messageCode = messageCode;
        this.message = message;
        this.data = data;
        this.successResponse = successResponse;
    }

    public static Result success() {
        return buildResult(ResultEnum.SUCCESS, null);
    }

    public static <T> Result<T> success(T data) {
        return buildResult(ResultEnum.SUCCESS, data);
    }

    public static <T> Result<T> success(String messageCode, String message) {
        return success(messageCode, message, null);
    }

    public static <T> Result<T> success(String messageCode, String message, T data) {
        return buildResult(ResultEnum.SUCCESS, messageCode, message, data);
    }

    public static Result fail() {
        return buildResult(ResultEnum.FAIL, null);
    }

    public static <T> Result<T> fail(T data) {
        return buildResult(ResultEnum.FAIL, data);
    }

    public static <T> Result<T> fail(String messageCode, String message) {
        return fail(messageCode, message, null);
    }

    public static <T> Result<T> fail(String messageCode, String message, T data) {
        return buildResult(ResultEnum.FAIL, messageCode, message, data);
    }

    private static <T> Result<T> buildResult(ResultEnum resultEnum, T data) {
        return buildResult(resultEnum, null, null, data);
    }

    private static <T> Result<T> buildResult(ResultEnum resultEnume, String messageCode, String message, T data) {
        return buildResult(resultEnume.code, messageCode, message, data);
    }

    private static <T> Result<T> buildResult(String resultCode, String messageCode, String message, T data) {
        return new Result<T>(resultCode, messageCode, message, data, isSuccess(resultCode));
    }

    /**
     * 判断返回结果是否为成功
     *
     * @param resultCode 结果状态码
     * @return boolean 是否
     */
    private static boolean isSuccess(String resultCode) {
        return Optional.ofNullable(resultCode)
                .map(code -> code.equals(ResultEnum.SUCCESS.code))
                .orElse(Boolean.FALSE);
    }
}
package cn.delei.example.common;

/**
 * 统一返回结果 resultCode 属性值枚举
 */
public enum ResultEnum {
    /**
     * 成功
     */
    SUCCESS("1"),
    /**
     * 失败
     */
    FAIL("0");

    public String code;

    ResultEnum(String code) {
        this.code = code;
    }
}
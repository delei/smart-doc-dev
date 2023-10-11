package cn.delei.example.user.enums;

public enum SexEnum {
    /**
     * 男
     */
    MALE("MALE"),
    /**
     * 女
     */
    FEMALE("FEMALE"),
    /**
     * 未知
     */
    UNKNOWN("UNKNOWN");
    private String sex;

    SexEnum(String sex) {
        this.sex=sex;
    }
}

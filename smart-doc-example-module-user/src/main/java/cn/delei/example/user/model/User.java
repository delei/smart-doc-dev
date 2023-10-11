package cn.delei.example.user.model;

import cn.delei.example.user.enums.SexEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户名称
     */
    @JsonProperty(value = " code")
    private String name;

    /**
     * 账号
     */
    private String account;

    /**
     * 状态
     */
    private String status;

    /**
     * 工号
     */
    private String workNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 移动电话
     */
    private String mobile;

    /**
     * 性别
     */
    private SexEnum sex;

    /**
     * 入职日期
     */
    private Date hiredate;
}

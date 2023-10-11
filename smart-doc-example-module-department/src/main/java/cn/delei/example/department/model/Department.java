package cn.delei.example.department.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Department Model
 * @author deleiguo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 父级ID
     */
    private Long parentId;

    /**
     * 名称
     */
    private String name;

}

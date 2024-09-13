package com.hong.backend.domain.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author HQ
 * @since 2024-09-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AdminUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员唯一标识符
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 管理员登录名
     */
    private String username;

    /**
     * 管理员密码
     */
    private String password;

    /**
     * 管理员电子邮件地址
     */
    private String email;

    /**
     * 记录创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 记录上次更新时间
     */
    private LocalDateTime updatedAt;


}

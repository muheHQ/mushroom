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
public class AdminLogs implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志唯一标识符
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 关联的管理员ID
     */
    private Integer adminUserId;

    /**
     * 管理员操作描述
     */
    private String action;

    /**
     * 日志时间戳
     */
    private LocalDateTime timestamp;

    /**
     * 操作详情
     */
    private String details;


}

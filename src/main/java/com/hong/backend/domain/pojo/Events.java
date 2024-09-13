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
public class Events implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 活动唯一标识符
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 活动名称
     */
    private String eventName;

    /**
     * 活动日期和时间
     */
    private LocalDateTime eventDate;

    /**
     * 关联的房间ID
     */
    private Integer roomId;

    /**
     * 活动描述
     */
    private String description;

    /**
     * 记录创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 记录上次更新时间
     */
    private LocalDateTime updatedAt;


}

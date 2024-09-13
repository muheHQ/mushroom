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
public class Rooms implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 房间唯一标识符
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 房间名称
     */
    private String roomName;

    /**
     * 房间容量
     */
    private Integer capacity;

    /**
     * 记录创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 记录上次更新时间
     */
    private LocalDateTime updatedAt;


}

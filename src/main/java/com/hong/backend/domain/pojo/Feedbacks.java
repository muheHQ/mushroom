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
public class Feedbacks implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 反馈唯一标识符
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 关联的用户ID
     */
    private Integer userId;

    /**
     * 反馈内容
     */
    private String feedback;

    /**
     * 评分（1到5分）
     */
    private Integer rating;

    /**
     * 记录创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 记录上次更新时间
     */
    private LocalDateTime updatedAt;


}

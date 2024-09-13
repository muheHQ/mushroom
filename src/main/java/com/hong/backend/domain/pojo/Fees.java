package com.hong.backend.domain.pojo;

import java.math.BigDecimal;
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
public class Fees implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 费用唯一标识符
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 关联的用户ID
     */
    private Integer userId;

    /**
     * 费用金额
     */
    private BigDecimal amount;

    /**
     * 费用描述
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

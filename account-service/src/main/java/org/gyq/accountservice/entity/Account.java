package org.gyq.accountservice.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
/**
 * @Author:guoyaqi
 * @Date: 2025/1/8 22:54
 */
@Data
@TableName("account_tbl")
public class Account {
    @TableId
    private Long id;
    private String userId;
    private Integer money;
}

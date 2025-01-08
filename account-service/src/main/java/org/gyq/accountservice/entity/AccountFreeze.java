package org.gyq.accountservice.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
/**
 * @Author:guoyaqi
 * @Date: 2025/1/9 0:49
 */
@Data
@TableName("account_freeze_tbl")
public class AccountFreeze {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer accountId;
    private Integer freezeMoney;
    private Integer status;
    public static abstract class State {
        public final static int TRY = 0;
        public final static int CONFIRM = 1;
        public final static int CANCEL = 2;
    }
}

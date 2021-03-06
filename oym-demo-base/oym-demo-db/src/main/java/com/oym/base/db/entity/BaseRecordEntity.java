package com.oym.base.db.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author zhangyd
 * @date 2019/10/18 11:43
 * @desc 默认的只需要记录的实体类 比如日志记录表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public abstract class BaseRecordEntity extends BaseEntity {

    // 主键
    @TableId(value = ID, type = IdType.AUTO)
    protected Long id;
    // 创建时间
    @TableField(value = CREATE_TIME, insertStrategy = FieldStrategy.NOT_NULL)
    protected Date gmtCreate;

}

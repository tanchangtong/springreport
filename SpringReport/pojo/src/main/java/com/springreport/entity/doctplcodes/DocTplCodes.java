 /** 
 * 模块：报表系统-DocTplCodes
 * 本文件由代码生成器自动完成,不允许进行修改
 */
package com.springreport.entity.doctplcodes;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.springreport.base.PageEntity;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

 /**  
* @Description: doc_tpl_codes - 
* @author 
* @date 2024-10-23 09:51:07
* @version V1.0  
 */
@Data
@TableName("doc_tpl_codes")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DocTplCodes extends PageEntity {

    /** id - 主键 */
    
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /** tpl_id - 模板id */
    @TableField("tpl_id")
    private Long tplId;

    /** code_url - 条形码/二维码对应的图片链接 */
    @TableField("code_url")
    private String codeUrl;

    /** code_name - 名称 */
    @TableField("code_name")
    private String codeName;

    /** dataset_id - 数据集id */
    @TableField("dataset_id")
    private Long datasetId;

    /** dataset_name - 数据集名称 */
    @TableField("dataset_name")
    private String datasetName;

    /** value_field - 数值字段 */
    @TableField("value_field")
    private String valueField;

    /** code_type - 类型 1条形码 2二维码 */
    @TableField("code_type")
    private Integer codeType;

    /** creator - 创建人 */
    @TableField(value = "creator",fill = FieldFill.INSERT)
    private Long creator;

    /** create_time - 创建时间 */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;

    /** updater - 更新人 */
    @TableField(value = "updater",fill = FieldFill.INSERT_UPDATE)
    private Long updater;

    /** update_time - 更新时间 */
    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /** del_flag - 删除标记 1未删除 2已删除 */
    @TableField("del_flag")
    private Integer delFlag;
}
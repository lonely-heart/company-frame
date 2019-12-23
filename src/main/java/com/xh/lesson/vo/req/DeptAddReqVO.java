package com.xh.lesson.vo.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @ClassName: DeptAddReqVO
 * TODO:类文件简单描述
 * @Author: 小霍
 * @CreateDate: 2019/9/19 13:30
 * @UpdateUser: 小霍
 * @UpdateDate: 2019/9/19 13:30
 * @Version: 0.0.1
 */
@Data
public class DeptAddReqVO {
    @ApiModelProperty(value = "机构名称")
    @NotBlank(message = "机构名称不能为空")
    private String name;

    @ApiModelProperty(value = "父级id 一级为 0")
    @NotBlank(message = "父级id不能为空")
    private String pid;

    @ApiModelProperty(value = "部门经理id")
    private String deptManagerId;

    @ApiModelProperty(value = "部门经理名称")
    private String managerName;

    @ApiModelProperty(value = "部门经理电话")
    private String phone;

    @ApiModelProperty(value = "机构状态(1:正常；0:弃用)")
    private Integer status;

}

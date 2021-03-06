package com.company.project.business.vo.role;

import com.company.project.business.enums.StatusEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class RoleAddReqVO {
    @ApiModelProperty(value = "角色名称")
    @NotBlank(message = "名称不能为空")
    private String name;

    @ApiModelProperty(value = "角色描述")
    private String description;

    @ApiModelProperty(value = "状态(1:正常0:弃用)")
    private StatusEnum status;

    @ApiModelProperty(value = "所拥有的菜单权限")
    private List<Long> permissions;
}

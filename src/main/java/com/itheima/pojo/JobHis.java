package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


/**
 * 部门实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobHis {

    private Integer employeeId;

    private Integer jobTitleId;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean currentStatus;

}

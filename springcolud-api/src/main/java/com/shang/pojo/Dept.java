package com.shang.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author shang
 * @PackageName:com.shang.pojo
 * @ClassName:Dept
 * @Description:
 * @date 2021/3/16 18:36
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptNo;
    private String deptName;
    private String dbSource;
}

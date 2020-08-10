package com.github.studyjdk.bean;

import lombok.Builder;
import lombok.Data;

/**
 * JavaBean
 *
 * @author 欧阳洁
 * @date 2020/8/3 22:49
 */
@Data
@Builder
public class JavaBean {
    private Long keyId;
    private Long value;
    private Long score;
}

package com.github.studyjdk.test;

import com.github.studyjdk.bean.JavaBean;

/**
 * Lomok语法糖
 *
 * @author 欧阳洁
 * @date 2020/8/10 15:35
 */
public class LomokSyntaxSugar {
    public static void main(String[] args) {
        JavaBean bean = JavaBean.builder().value(1L).keyId(2L).score(88L).build();
        System.out.println(bean.toString());
    }
}

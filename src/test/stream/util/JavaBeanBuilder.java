package stream.util;

import stream.vo.JavaBean;

import java.util.stream.Stream;

/**
 * JavaBean 构造器
 * @author 欧阳洁
 * @date 2020/8/4 23:45
 */
public class JavaBeanBuilder {
    private JavaBean instant;
    public JavaBeanBuilder(JavaBean instant) {
        this.instant = instant;
    }
    public static JavaBeanBuilder builder() {
        return new JavaBeanBuilder(new JavaBean());
    }
    public JavaBeanBuilder keyId(Long value) {
        this.instant.setKeyId(value);
        return this;
    }
    public JavaBeanBuilder value(Long value) {
        this.instant.setValue(value);
        return this;
    }
    public JavaBeanBuilder score(Long value) {
        this.instant.setScore(value);
        return this;
    }
    public JavaBean build() {
        JavaBean result = this.instant;
        this.instant = null;
        return result;
    }

    public static void main(String[] args) {
        JavaBean bean = JavaBeanBuilder.builder().keyId(1L).value(2L).score(99L).build();
        System.out.println(bean.getKeyId());
    }
}

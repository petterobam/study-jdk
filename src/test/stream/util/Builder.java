package stream.util;

import stream.vo.JavaBean;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/**
 * 通用构造器
 *
 * @author 欧阳洁
 * @date 2020/8/4 23:27
 */
public class Builder<T> {
    private T instant;

    public Builder(Supplier<T> supplier) {
        this.instant = supplier.get();
    }

    public static <T> Builder<T> of(Supplier<T> supplier) {
        return new Builder(supplier);
    }

    public <D> Builder<T> with(BiConsumer<T, D> consumer, D value) {
        consumer.accept(this.instant, value);
        return this;
    }

    public T build() {
        T result = this.instant;
        this.instant = null;
        return result;
    }

    public static void main(String[] args) {
        JavaBean bean = Builder.of(JavaBean::new)
                .with(JavaBean::setKeyId, 1L)
                .with(JavaBean::setValue, 2L)
                .with(JavaBean::setScore, 99L)
                .build();
        System.out.println(bean.getKeyId());
    }
}

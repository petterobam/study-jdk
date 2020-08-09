package syntax;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Lambda 语法糖调试
 *
 * @author 欧阳洁
 * @date 2020/8/8 14:24
 */
public class LambdaSyntaxSugar {
    private String str;
    public void not_main() {
        Supplier supplier = () -> 3;
        Supplier supplier2 = () -> this.str;
    }

    public static void main(String[] args) {
        Supplier supplier = () -> 3;
        Object a = supplier.get();

        Function function = (t) -> 4;
        Object b = function.apply(a);

        Consumer consumer = (t) -> {};
        consumer.accept(b);

        Predicate predicate = (t) -> false;
        predicate.test(a == b);
    }
}

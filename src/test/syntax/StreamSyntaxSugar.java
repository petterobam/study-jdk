package syntax;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/**
 * Stream 相关测试
 *
 * @author 欧阳洁
 * @date 2020/8/9 10:43
 */
public class StreamSyntaxSugar {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.parallelStream().forEach(out::println);
    }
}

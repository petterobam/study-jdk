package stream;

import stream.vo.Book;
import stream.vo.JavaBean;
import stream.vo.Obj;
import stream.vo.Order;
import stream.vo.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream相关测试
 *
 * @author 欧阳洁
 * @date 2020/8/2 21:03
 */
public class StreamTest {
    public static void main(String[] args) {
        Obj[] objs = new Obj[0];
        Map<String, String> res = Stream.of(objs).collect(Collectors.toMap(Obj::getId, Obj::getName));

        List<Student> students = new ArrayList<>();
        Map<String, List<Student>> classStudentsMap = students.stream().collect(Collectors.groupingBy(Student::getClassId));

        List<JavaBean> list = new ArrayList<>();
        Map<Long, List<Long>> result = list.stream().collect(Collectors.groupingBy(JavaBean::getKeyId, Collectors.mapping(JavaBean::getValue, Collectors.toList())));

        List<Order> orders = new ArrayList<>();
        List<String> ids = orders.stream().map(o -> o.getUserId()).distinct().collect(Collectors.toList());

        List<JavaBean> datas = new ArrayList<>();
        long count = datas.stream().filter(d -> d.getScore() > 80).count();

        List<String> strs = new ArrayList<>();
        String output = strs.stream().distinct().collect(Collectors.joining(","));

        List<Book> books = new ArrayList<>();
        Optional<Book> thickBook = books.parallelStream().max(Comparator.comparing(Book::getPages));

        datas.stream().forEach(JavaBean::doSomething);
    }
}

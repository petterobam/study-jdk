package syntax;

import java.util.ArrayList;
import java.util.List;

/**
 * 语法糖测试
 *
 * @author 欧阳洁
 * @date 2020/8/2 21:08
 */
public class SyntaxSugar {
    public static void main(String[] args) {
        // 自动拆装箱
        Integer i = 2;
        int t = i;
        int g = new Integer("3");
        i++;
        // 数字加下划线自动去下划线
        int num = 1000_0_0000;
        long nums = 1000_0000000_0_0_0L;
        // 字符串相加
        String str1 = "A" + "B";
        String str2 = new String("A");
        String str3 = str1 + "C";
        String str4 = str2 + "B";
        String str5 = 4 + str1;

        // while、do while、for 循环底层基础语法
        while (i < 5) {
            i++;
        }
        do {
            t += 1;
        } while (t < 4);
        int[] arr = new int[]{
                1, 2, 4, 5
        };
        for (int i1 : arr) {
            System.out.println(i1);
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (Integer integer : list) {
            System.out.println(integer);
        }

        for (int k = 0; i < 5; k++) {
            System.out.println(k);
        }
        // switch 语句
        String str = "2";
        switch (str) {
            case "2":
                g = 5;
                break;
            case "5":
                g = 10;
                break;
            default:
                g = 2;
        }
    }

    public static enum TestEnum {
        V1,V2
    }
}

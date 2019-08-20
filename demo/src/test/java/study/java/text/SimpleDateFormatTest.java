package study.java.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

import sun.util.locale.BaseLocale;

/**
 * 文件描述 日期格式化测试
 *
 * @author ouyangjie
 * @Title: SimpleDateFormatTest
 * @ProjectName study-jdk
 * @date 2019/8/14 1:40 PM
 */
public class SimpleDateFormatTest {
    @Test
    public void date1() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dateStr = "30/Sep/2015";
            Date date = sdf.parse(dateStr);
            System.out.println(date.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void date1_1() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy", Locale.US);
            String dateStr = "30/Sep/2015";
            Date date = sdf.parse(dateStr);
            System.out.println(date.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void date1_2() {
        try {
            Locale locale = Locale.US;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z", locale);
            String dateStr = "17/Mar/2019:00:00:29 +0800";
            Date date = sdf.parse(dateStr);
            System.out.println(date.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void date2() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            Date date = new Date("17/Mar/2019:00:00:29 +0800");
            String dateStr = sdf.format(date);
            System.out.println(sdf.format(date));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void date3() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date("Mon Mar 30 00:00:00 CST 2015");
            String dateStr = sdf.format(date);
            System.out.println(sdf.format(date));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

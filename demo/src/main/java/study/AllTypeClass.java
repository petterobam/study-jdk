package study;

/**
 * 文件描述 包含java最全类型的类
 *
 * @author ouyangjie
 * @Title: AllTypeClass
 * @ProjectName study-jdk
 * @date 2019/8/31 10:46 AM
 */
public class AllTypeClass {
    int param = 0;
    private int intParam = 0;
    private long longParam = 2L;
    private float floatParam = 0.1f;
    private double doubleParamcl = 0.001d;
    private boolean booleanParam = false;
    private byte byteParam = 0;
    private String stringParam = "0";
    private Object objectParam = new Object();
    public Object objectPubParam = new Object();
    private static Object objectStaticParam = new Object();
    public static Object objectPubStaticParam = new Object();
    public final static Object objectPubFinalStaticParam = new Object();
    public volatile static Object objectPubVolatileStaticParam = new Object();

    private void emptyMethod() {}

    private void privateEmptyMethod() {}

    private int getIntParam() {
        return intParam;
    }

    private void privateMethod() {
        int a = 9;
        System.out.println("0");
    }

    private void privateMethodWithParam(String out) {
        System.out.println(out);
    }

    private synchronized void privateSyncMethod() {}

    public synchronized void publicSyncMethod() {}

    private static void privateStaticMethod() {}

    private final void privateFinalMethod() {}

    private final int privateFinalMethodWithParm() {
        return 0;
    }

    private final static void privateFinalStaticMethod() {}

    {
        intParam = 1;
    }

    static {
        objectPubStaticParam = "0";
    }

    class innerClass {
        private int intParam = 0;
    };

    abstract class innerAbstractClass {
        public abstract void abstractMethod();
    }

    public class innerPubClass {
        private int intParam = 0;
    };
}

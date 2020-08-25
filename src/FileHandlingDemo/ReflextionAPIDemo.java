package FileHandlingDemo;

import java.lang.reflect.Method;

public class ReflextionAPIDemo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("FileHandlingDemo.Test");
       Test t = (Test)c.newInstance();
        Method m = c.getDeclaredMethod("show",null);
        m.setAccessible(true);
        t.show();
       m.invoke(t,null);


    }
}

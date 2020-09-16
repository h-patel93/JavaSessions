package AnnotationsDemo;

import java.lang.annotation.*;

public class UserDefinedAnnotations {
    public static void main(String[] args) {

        NokiaSeries n = new NokiaSeries("fire",5);
        Class c = n.getClass();
        Annotation an = c.getAnnotation(Smartphone.class);
        Smartphone s = (Smartphone) an;
        System.out.println(s.os());
        System.out.println(s.version());


    }
}
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone
{
    String os() default "symbian";
    int version()default 6;
}

@Smartphone(os = "android",version=8)
class NokiaSeries
{
    String model;
    int size;

    public NokiaSeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

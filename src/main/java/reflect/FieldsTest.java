package reflect;

import bean.Student;
import bean.Student1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
 * 获取成员变量并调用：
 *
 * 1.批量的
 *      1).Field[] getFields():获取所有的"公有字段"
 *      2).Field[] getDeclaredFields():获取所有字段，包括：私有、受保护、默认、公有；
 * 2.获取单个的：
 *      1).public Field getField(String fieldName):获取某个"公有的"字段；
 *      2).public Field getDeclaredField(String fieldName):获取某个字段(可以是私有的)
 *
 *   设置字段的值：
 *      Field --> public void set(Object obj,Object value):
 *                  参数说明：
 *                  1.obj:要设置的字段所在的对象；
 *                  2.value:要为字段设置的值；
 *
 */
public class FieldsTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.获取Class对象
        Class clazz = Class.forName("bean.Student1");
        // 2.获取字段
        System.out.println("************获取所有公有的字段********************");
        Field[] fields = clazz.getFields();
        for(Field f : fields){
            System.out.println(f);
        }

        System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");
        fields = clazz.getDeclaredFields();
        for(Field f : fields){
            System.out.println(f);
        }

        System.out.println("*************获取公有字段**并调用***********************************");
        Field field = clazz.getField("name");
        System.out.println(field);
        //获取一个对象
        Object obj = clazz.getConstructor().newInstance(); //产生Student1对象--》Student1 stu = new Student1();
        //为字段设置值
        field.set(obj,"刘德华");
        // 验证
        Student1 stu1 = (Student1) obj;
        System.out.println(stu1.name);

        System.out.println("**************获取私有字段****并调用********************************");
        field = clazz.getDeclaredField("phoneNum");
        System.out.println(field);
        //暴力反射，解除私有限定
        field.setAccessible(true);
        field.set(obj,"15928794444");
        System.out.println(stu1);
    }
}

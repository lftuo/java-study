package reflect;

import bean.Student;

/**
 * 获取Class对象的三种方式
 * 1 Object ——> getClass();
 * 2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
 * 3 通过Class类的静态方法：forName（String  className）(常用)
 *
 */
public class GetReflectFuns {
    public static void main(String[] args){
        //第一种方式获取Class对象
        Student stu1 = new Student();
        Class clazz1 = stu1.getClass();
        System.out.println(clazz1.getName());

        //第二种方式获取Class对象
        Class clazz2 = Student.class;
        System.out.println(clazz2 == clazz1); //判断第一种方式获取的Class对象和第二种方式获取的是否是同一个

        // 第三种方式获取Class对象
        try {
            Class clazz3 = Class.forName("bean.Student"); //注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
            System.out.println(clazz3 == clazz1);//判断第一种方式获取的Class对象和第三种方式获取的是否是同一个
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

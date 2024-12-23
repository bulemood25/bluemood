package Study;
import Class.Person1;

public class ObjectStudy {
    public static void main(String[] args) {

        Person1 p1=new Person1("tom",21);
        Person1 p2=new Person1("tom",21);

        System.out.println(p1.getName()==p2.getName()); // 输出:true
        System.out.println(p1.getName().equals(p2.getName())); // 输出: true
        /**
         *两个对象的name同为String类型，且都为“tom”，引用的同一个缓存池对象
         */

System.out.println(p1);
    }
}

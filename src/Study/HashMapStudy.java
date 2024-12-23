package Study;

import Class.Person1;

import java.util.HashMap;


public class HashMapStudy {

    public static void main(String[] args) {


     Person1 p1=new Person1("tom",21);
     Person1 p2=new Person1("tom",21);
     Person1 p3=new Person1("tom",212);
     Person1 p4=new Person1("tom",212);
      HashMap<Person1, String> map = new HashMap<>();

        map.put(p1, "Value1");
        map.put(p2, "Value2");
        map.put(p3, "Value3");
        System.out.println(map.size()); // 输出: 2
        System.out.println(map.get(p1)); // 输出: Value2
        System.out.println(map.get(p2)); // 输出: Value2
        System.out.println(map.get(p3)); // 输出: Value3
        System.out.println(map.get(p4));
/**
 * hashmap中允许出现两个不同的键拥有相同的值，后出现的相同的键的值会覆盖先前相同键的值
 */

    }

}



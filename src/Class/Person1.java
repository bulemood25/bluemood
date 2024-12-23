package Class;
import java.util.Objects;
 public class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter 和 Setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "Class.Person1{name='" + name + "', age=" + age + "}";
    }

    // 重写 equals 方法
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person1 other = (Person1) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    // 重写 hashCode 方法
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    /**
     * 如过重写equal而不重写hashcode会导致相同的对象无法访问到对应的值，
     * hashcode的默认方法为按照内存地址计算，如果equal的比较条件是两个对象name和age相同时成立，而默认的hashcode计算两个对象的内存地址而导致返回false
     */
}

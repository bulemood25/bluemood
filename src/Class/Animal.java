package Class;

public class Animal {
    protected String name;
    protected int age;
    public Animal()
    {
        this.name="没有名字的动物2";
        this.age=10;
    }
   public Animal(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void eat()
    {
        System.out.println("age="+age+"  "+name+"  "+"animal eat something");
    }

}

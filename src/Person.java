public class Person {
    String name;
    int age;
    Person(){

    }
    Person(String name,int age) {
        this.name=name;
        this.age=age;
    }

    void eat() {
        System.out.println("吃饭");
    }

    void talk() {
        System.out.println("讲话");
    }

    void introduce() {
        System.out.println("我的名字是:" + name + ",我的年龄是:" + age);
    }
}
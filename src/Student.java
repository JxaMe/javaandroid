public class Student extends Person {
    Student() {
        super();
    }

    Student(String name, int age) {
        super(name, age);
        System.out.println("我的名字是:" + name + ",我的年龄是:" + age);
    }
}

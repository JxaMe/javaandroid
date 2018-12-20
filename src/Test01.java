public class Test01 {
    public static void main(String[] args) {
        Chinese chinese = new Chinese() {
            @Override
            void eat() {
                System.out.println("复写抽象函数函数");
            }
        };
        chinese.eat();

    }
}

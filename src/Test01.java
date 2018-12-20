public class Test01 {
    public static void main(String[] args) {
        int num = 2313;
        if (num <= 100 && num >= 90) {
            System.out.println("优");
        } else if (num < 90 && num >= 70) {
            System.out.println("良");
        } else if (num < 70 && num >= 60) {
            System.out.println("中");
        } else if (num < 60 && num >= 0) {
            System.out.println("差");
        } else if (num > 100 || num < 0) {
            System.out.println("输入有误!");
        }

    }
}

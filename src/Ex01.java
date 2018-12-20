public class Ex01 {
    public static void main(String[] args) {
        //for循环打印100-200之间的素数
        //便利100-200之间的数字
        for (int i = 100; i <= 200; i++) {
            //判断素数
            boolean b = false;
            for (int j = 2; j < i - 1; j++) {
                int k = i % j;
                if (k == 0) {
                    b = true;
                }

            }
            if (!b) {
                System.out.println(i);
            }
        }
    }
}

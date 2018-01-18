package itcast.mathTest;

/*
    请使用Math相关的API，计算在-10.8 到5.9 之间,绝对值大于6 或者小于2.1的整数有多少个？
 */
public class Test1 {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int c = 0;
        for (double i = Math.ceil(min); i <= max; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                c++;
            }
        }
        System.out.println(c);
    }
}

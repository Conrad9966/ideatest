package itcast.arraysTest;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        // 定义随机的字符串
        String line = "ysKUreaytWTRHsgFdSAoidq";
        // 转换为字符数组
        char[] chars = line.toCharArray();
        System.out.println(chars);
        // 升序排序
        Arrays.sort(chars);
        // 反向遍历打印
        for (int i =  chars.length-1; i >= 0 ; i--) {
            System.out.print(chars[i]+" ");
        }
    }
}

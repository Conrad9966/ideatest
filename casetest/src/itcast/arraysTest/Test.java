package itcast.arraysTest;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 创建Random对象
        Random random  = new Random();
        // 定义数组长度
        int len =25;
        // 创建数组
        int[] arr = new int[len];
        // 循环添加随机数据
        for (int i = 0; i < len ; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println("排序前:"+ Arrays.toString(arr));
        // 升序排序
        Arrays.sort(arr);
        System.out.println("排序后:"+ Arrays.toString(arr));

    }
}

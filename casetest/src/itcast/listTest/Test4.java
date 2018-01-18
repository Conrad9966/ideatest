package itcast.listTest;

import java.util.ArrayList;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        // 创建Random 对象
        Random random = new Random();

        // 创建ArrayList 对象
        ArrayList<Integer> list = new ArrayList<>();

        // 添加随机数到集合
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(1000) + 1;
            list.add(r);
        }

        // 调用偶数集合的方法
        ArrayList<Integer> arrayList = getArrayList(list);
        System.out.println(arrayList);
    }

    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list) {
        // 创建新集合,来保存偶数
        ArrayList<Integer> smallList = new ArrayList<>();

        // 遍历list
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);

            // 判断为偶数,添加到新集合中
            if (num % 2 == 0){
                smallList.add(num);
            }
        }

        return smallList;
    }


}

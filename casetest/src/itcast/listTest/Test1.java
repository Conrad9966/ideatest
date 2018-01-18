package itcast.listTest;

import java.util.ArrayList;
import java.util.Random;

/*
psvm -main
sout -print

alt+Enter ,快速修复
Ctrl+Shift+Space，自动补全代码
Ctrl+X，删除行
Ctrl+Alt+L，格式化代码
shift + F6 ,重命名
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println();

        // 创建Random 对象
        Random random = new Random();
        // 创建集合对象
        ArrayList<Integer> list = new ArrayList<>();

        // 添加随机数到集合
        for (int i = 0; i < 6; i++) {
            int r = random.nextInt(33) + 1;
            list.add(r);
        }
        // 遍历集合输出
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}

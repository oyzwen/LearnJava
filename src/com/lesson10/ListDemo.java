package com.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/***
 * 用list记录1+2+3+...+10中间累加效果 输出累加结果如 1+2=3 3+3=6 用map将中国,美国,日本的国别和首都进行输出
 *
 * @author OW
 */
public class ListDemo {

    public static void main(String[] args) {

        // list 的插入和读取
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // 遍历list 迭代器
        Iterator it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int i = (int) it.next();
            System.out.println(sum + "+" + i + "=" + (sum + i));
            sum += i;
        }

        System.out.println("\n---------分割线----------\n");

        Map<String, String> map = new HashMap<String, String>();
        map.put("中国", "北京");
        map.put("美国", "华盛顿");
        map.put("日本", "东京");

        Iterator itMap = map.keySet().iterator();

        while (itMap.hasNext()) {
            Object obj = itMap.next();
            String str = (String) obj;
            String str2 = (String) map.get(str);
            System.out.println(str + "：" + str2);
        }
    }

}

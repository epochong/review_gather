package com.epochong;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author epochong
 * @date 2019/8/17 8:22
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class TestGather {
    @Test
    public void listTest() {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("wang");
        arrayList.add("chong");
        arrayList.add("fighting");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("chong")) {
                arrayList.remove("chong");
            }
            System.out.println(s);
        }
        List<String> list = new CopyOnWriteArrayList<>();
    }

    @Test
    public void hashCodeTest() {
        String str1 = "epochong";
        String str2 = "epochong";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println("str1 == str2 ：" + (str1 == str2));
        String str3 = new String("epochong");
        String str4 = new String("epochong");
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str3.hashCode() == str4.hashCode());
        System.out.println("str3 == str1 ：" + (str3 == str1));
    }
}

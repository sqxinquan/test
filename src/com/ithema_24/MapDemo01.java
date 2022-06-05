package com.ithema_24;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("itheima001","林青霞");
        map.put("itheima002","张曼玉");
        map.put("itheima003","王祖贤");
        map.put("itheima003","王昱翔");
        map.put("ithema004","王新权");
        System.out.println(map);

    }
}

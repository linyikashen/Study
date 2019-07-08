package com.sr;

import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.List;

public class FirstStudy {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("jinan");
        list.add("yantai");
        System.out.println(JSON.toJSONString(list));
    }
}

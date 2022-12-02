package com.example.forumserve.mybatis.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class returnMap {
    public HashMap<String, Object> returnMap(Object daObj) {
        HashMap<String,Object> da=new HashMap<>();
        da.put("code",200);
        da.put("tips","获取成功");
        da.put("data",daObj);
        return da;
    }

//    public Map<String, Object> returnMap(Object daObj) {
//        HashMap<String,Object> da=new HashMap<>();
//        da.put("code",200);
//        da.put("tips","获取成功");
//        da.put("data",daObj);
//        return da;
//
//    }
}

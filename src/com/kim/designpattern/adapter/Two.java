package com.kim.designpattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * 目标角色
 */
public class Two implements TwoI {
    @Override
    public Map<String, Object> getBaseInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "MethodTwo's name!");
        map.put("sex", "MethodTwo's sex!");
        return map;
    }

    @Override
    public Map<String, Object> getOfficeInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("num", "MethodTwo's num!");
        return map;
    }
}

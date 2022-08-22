package com.wgq.demo;

import java.util.HashMap;
import java.util.Map;

public class ServiceOperate {

    private final static Map<String, String> map = new HashMap<>();

    static {
        map.put("a", "The president of the world");
        map.put("b", "The rich");
        map.put("c", "The poor");
    }

    private String param;

    public ServiceOperate(String param){
        this.param = param;
    }

    public String operate() {
        return map.getOrDefault(param, "ERROR PARAM");
    }
}

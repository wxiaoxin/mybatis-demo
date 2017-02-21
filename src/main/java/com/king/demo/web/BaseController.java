package com.king.demo.web;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by Administrator on 2017/2/21.
 */
public class BaseController {

    String success(String msg) {
        return this.success(msg, null);
    }

    String success(String msg, Object content) {
        JSONObject result = new JSONObject();
        result.put("code", 0);
        result.put("msg", msg);
        if(content != null) {
            result.put("content", content);
        }
        return result.toJSONString();
    }

    String error(int code, String msg) {
        JSONObject result = new JSONObject();
        result.put("code", code);
        result.put("msg", msg);
        return result.toJSONString();
    }

}

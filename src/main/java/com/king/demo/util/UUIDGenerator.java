package com.king.demo.util;

import java.util.UUID;

/**
 * Created by Administrator on 2017/2/21.
 */
public class UUIDGenerator {

    public static String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}

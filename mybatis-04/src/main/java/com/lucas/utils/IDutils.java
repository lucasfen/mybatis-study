package com.lucas.utils;

import java.util.UUID;

/**
 * @author lucas
 * @create 2020/11/23
 */
@SuppressWarnings("all")
public class IDutils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}

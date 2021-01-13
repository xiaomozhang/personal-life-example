package com.xiaozhangge.common.util;

import java.util.UUID;

/**
 * Created by xiaozhangge on 2020-01-06.
 */
@Deprecated
public class IdHelper {

    private final static Snowflake SNOWFLAKE = new Snowflake(0);

    public static Long id() {
        return SNOWFLAKE.next();
    }

    public static String uuid() {
        return UUID.randomUUID().toString().toLowerCase().replace("-", "");
    }
}

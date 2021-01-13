package com.xiaozhangge.security.util;

import com.google.gson.Gson;
import com.xiaozhangge.security.common.ResponseWrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xiaozhangge on 2019-03-25.
 */
public class ResourcesUtils {

    public static void writer(ResponseWrapper wrapper, HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        // 状态
        response.setStatus(200);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.write(new Gson().toJson(wrapper));
    }
}

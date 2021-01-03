package com.yehl.utils;

import java.time.LocalDateTime;

public class CommonUtils {

    public static int generateInt() {
        LocalDateTime localDateTime = LocalDateTime.now();
        int lineNum = localDateTime.getHour()*10000 + localDateTime.getMinute()*100 + localDateTime.getSecond();
        return lineNum;
    }
}

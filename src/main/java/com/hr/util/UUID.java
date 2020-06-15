package com.hr.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liuhuanran
 * @version 1.0
 * @date 2020/6/15 17:42
 */
public class UUID {
    public static Long getUId(){
        String numStr = "1";
        String trandStr = String.valueOf((Math.random() * 9 + 1) * 10000);
        String dataStr = new SimpleDateFormat("yyyyMMdd").format(new Date());
        numStr = trandStr.toString().substring(0, 5);
        numStr = numStr + dataStr ;
        return Long.valueOf(numStr);
    }
}

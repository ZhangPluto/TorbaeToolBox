package top.plutozrh.torbaetoolbox.utils;


/*
 * @program TorbaeToolBox
 *
 * @class isNumberic
 *
 * @create Jul 06, 2022 20:39
 */

import java.math.BigDecimal;

/**
 * 判断是否为数字
 *
 * @author renhaozhang
 */
public class IsNumberic {
    public static boolean isNumberic(String str){
        String bigStr;
        try {
            bigStr = new BigDecimal(str).toString();
        } catch (Exception e){
            return false;
        }
        return true;
    }
}

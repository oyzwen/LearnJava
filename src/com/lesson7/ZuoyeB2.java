package com.lesson7;

/***
 * 2、对字符串"abc,cba,nba,sba"中的b替换成s,将小写转换成大写，按逗号","拆分，分成四组输出。
 *
 * @author OW
 */

public class ZuoyeB2 {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        String str3 = "nba";
        String str4 = "sba";

        str1 = modify(str1);
        str2 = modify(str2);
        str3 = modify(str3);
        str4 = modify(str4);
    }

    //b替换成s,将小写转换成大写，按逗号","拆分，分成四组输出。
    public static String modify(String str) {
        String result = str.replace("b", "s").toUpperCase();

        String strPrint = "";//需要输出的字符串

        for (int i = 0; i < result.length(); i++) {
            strPrint += result.charAt(i) + ",";//每个字符后加一个","
        }

        strPrint = strPrint.substring(0, strPrint.length() - 1);//去掉最后的",";

        System.out.println(strPrint);

        return result;
    }

}

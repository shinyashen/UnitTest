package org.apache.commons.lang3;
public class StringTest {
    // 断言机制
    public static void assertEqual(boolean src, boolean des, String str) {
        if (src ^ des)
            System.err.println(str + "Error!");
        else System.out.println(str + "Pass!");
    }
    public static void main(String[] args) {
        // 测试isEmpty方法
        assertEqual(StringUtils.isEmpty(""), true, "testIsEmpty ");
        assertEqual(StringUtils.isEmpty(null), true, "testIsEmpty ");
        assertEqual(StringUtils.isEmpty("test"), false, "testIsEmpty ");

        // 测试isNotEmpty方法
        assertEqual(StringUtils.isNotEmpty(""), false, "testIsNotEmpty ");
        assertEqual(StringUtils.isNotEmpty(null), false, "testIsNotEmpty ");
        assertEqual(StringUtils.isNotEmpty("test"), true, "testIsNotEmpty ");

        // 测试isBlank方法
        assertEqual(StringUtils.isBlank(""), true, "testIsBlank ");
        assertEqual(StringUtils.isBlank(" "), true, "testIsBlank ");
        assertEqual(StringUtils.isBlank("test"), false, "testIsBlank ");
    }


}

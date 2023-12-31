package org.apache.commons.lang3;

import org.junit.Test;

public class StringTestJUit {
    // 断言机制
    public void assertEqual(boolean src, boolean des, String str) {
        if (src ^ des)
            System.err.println(str + "Error!");
        else System.out.println(str + "Pass!");
    }

    // 测试isEmpty方法
    @Test
    public void testIsEmpty() {
        assertEqual(StringUtils.isEmpty(""), true, "testIsEmpty ");
        assertEqual(StringUtils.isEmpty(null), true, "testIsEmpty ");
        assertEqual(StringUtils.isEmpty("test"), false, "testIsEmpty ");
    }

    // 测试isEmpty方法
    @Test
    public void testIsNotEmpty() {
        assertEqual(StringUtils.isNotEmpty(""), false, "testIsNotEmpty ");
        assertEqual(StringUtils.isNotEmpty(null), false, "testIsNotEmpty ");
        assertEqual(StringUtils.isNotEmpty("test"), true, "testIsNotEmpty ");
    }

    // 测试isBlank方法
    @Test
    public void testIsBlank() {
        assertEqual(StringUtils.isBlank(""), true, "testIsBlank ");
        assertEqual(StringUtils.isBlank(" "), true, "testIsBlank ");
        assertEqual(StringUtils.isBlank("test"), false, "testIsBlank ");
    }

}

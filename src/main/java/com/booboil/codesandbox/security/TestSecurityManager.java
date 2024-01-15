package com.booboil.codesandbox.security;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.Charset;

/**
 * 测试安全管理器
 */
public class TestSecurityManager {

    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());
        // 读文件
        FileUtil.writeString("aa", "aaa", Charset.defaultCharset());
    }
}

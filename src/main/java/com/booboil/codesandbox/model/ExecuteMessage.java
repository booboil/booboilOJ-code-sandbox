package com.booboil.codesandbox.model;

import lombok.Data;

/**
 * 进程执行信息
 */
@Data
public class ExecuteMessage {

    /**
     * 程序退出值
     */
    private Integer exitValue;

    /**
     * 程序进程信息
     */
    private String message;

    /**
     * 程序错误信息
     */
    private String errorMessage;

    /**
     * 执行用时
     */
    private Long time;

    /**
     * 执行内存
     */
    private Long memory;
}

package com.booboil.codesandbox;

import com.booboil.codesandbox.model.ExecuteCodeRequest;
import com.booboil.codesandbox.model.ExecuteCodeResponse;

import java.io.IOException;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) throws IOException;
}

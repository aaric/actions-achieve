package com.incarcloud.hproj.api.impl;

import com.incarcloud.common.data.ResponseData;
import com.incarcloud.hproj.api.HelloApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 问候API接口实现
 *
 * @author Aaric, created on 2020-02-28T11:24.
 * @version 0.0.1-SNAPSHOT
 */
@RestController
public class HelloApiImpl implements HelloApi {

    @Override
    @GetMapping("/hproj/hello/sayHi")
    public ResponseData<String> sayHi() {
        return ResponseData.ok("Good night").extraMsg("请求成功");
    }
}

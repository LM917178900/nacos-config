package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: ConfigController
 * @author: leiming5
 * @date: 2020-07-11 09:48
 */

/**
 * <p>
 * <p>集成外部系统 控制器
 * </p>
 *
 * @author liming31
 * @since 2019-10-18
 */
@RestController
public class ConfigController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }

}

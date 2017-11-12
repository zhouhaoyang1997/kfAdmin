package com.kf.admin.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhy
 * @create 2017-11-12 20:57
 **/
@Component
@ConfigurationProperties(prefix = "path")
public class BasePath {
    static String  basePath;

    public static String getBasePath() {
        return basePath;
    }

    public static void setBasePath(String basePath) {
        BasePath.basePath = basePath;
    }
}

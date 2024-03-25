package com.blog.weiblog.service;

import java.util.Map;

public interface ConfigService {
    Map<String,String> getAllConfigs();

    int updateConfig(String websiteName, String websiteName1);
}

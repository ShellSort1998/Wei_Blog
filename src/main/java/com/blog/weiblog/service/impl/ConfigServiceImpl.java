package com.blog.weiblog.service.impl;

import com.blog.weiblog.dao.ConfigMapper;
import com.blog.weiblog.entity.BlogConfig;
import com.blog.weiblog.service.ConfigService;
import org.springframework.stereotype.Service;

import com.blog.weiblog.service.ConfigService;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ConfigServiceImpl implements ConfigService {
    @Resource
    private ConfigMapper configMapper;

    public static final String websiteName = "Wei's Blog";
    public static final String websiteDescription = "Wei's Blog是SpringBoot2+Thymeleaf+Mybatis建造的个人博客网站.";
    public static final String websiteLogo = "/admin/dist/img/logo2.png";
    public static final String websiteIcon = "/admin/dist/img/favicon.png";

    public static final String yourAvatar = "/admin/dist/img/wx_460_460.jpg";
    public static final String yourEmail = "wwx18846938401@163.com";
    public static final String yourName = "Wei";

    public static final String footerAbout = "Wei's Blog. have fun.";
    public static final String footerICP = "陕ICP备 xxxxxx-x号";
    public static final String footerCopyRight = "@2023 Spike";
    public static final String footerPoweredBy = "Wei's Blog";
    public static final String footerPoweredByURL = "##";
    @Override
    public Map<String, String> getAllConfigs() {
        //获取所有的map并封装为map
        List<BlogConfig> blogConfigs = configMapper.selectAll();
        Map<String, String> configMap = blogConfigs.stream().collect(Collectors.toMap(BlogConfig::getConfigName, BlogConfig::getConfigValue));
        for (Map.Entry<String, String> config : configMap.entrySet()) {
            if ("websiteName".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(websiteName);
            }
            if ("websiteDescription".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(websiteDescription);
            }
            if ("websiteLogo".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(websiteLogo);
            }
            if ("websiteIcon".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(websiteIcon);
            }
            if ("yourAvatar".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(yourAvatar);
            }
            if ("yourEmail".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(yourEmail);
            }
            if ("yourName".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(yourName);
            }
            if ("footerAbout".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(footerAbout);
            }
            if ("footerICP".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(footerICP);
            }
            if ("footerCopyRight".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(footerCopyRight);
            }
            if ("footerPoweredBy".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(footerPoweredBy);
            }
            if ("footerPoweredByURL".equals(config.getKey()) && !StringUtils.hasText(config.getValue())) {
                config.setValue(footerPoweredByURL);
            }
        }
        return configMap;
    }

    @Override
    public int updateConfig(String configName, String configValue) {
        BlogConfig blogConfig = configMapper.selectByPrimaryKey(configName);
        if (blogConfig != null) {
            blogConfig.setConfigValue(configValue);
            blogConfig.setUpdateTime(new Date());
            return configMapper.updateByPrimaryKeySelective(blogConfig);
        }
        return 0;
    }
}

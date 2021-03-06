package com.oym.base.web.config;

import com.oym.base.web.log.BaseControllerLog;
import com.oym.base.web.log.DefaultControllerLog;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangyd
 * @date 2020/5/27 22:07
 * @desc
 */
@Configuration
public class ControllerConfig {

    @Bean
    @ConditionalOnMissingBean(BaseControllerLog.class)
    @ConditionalOnProperty(value = "oym.web.default.log", havingValue = "true")
    public DefaultControllerLog defaultControllerLog() {
        return new DefaultControllerLog();
    }
}

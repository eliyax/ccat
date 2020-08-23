package com.eliyax.ccat.platform.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 获取 jwt 配置参数
 *
 * @author Eliyax
 * @date 2020/8/23 0:26
 */
@Data
@Component
@ConfigurationProperties(prefix = "com.eliyax.ccat.jwt")
public class JwtProperties {

    /**
     * 密匙
     */
    private String  secret;

    /**
     * 过期时间-默认半个小时
     */
    private Long expiration;

    /**
     * 默认存放token的请求头
     */
    private String tokenHeader;

    /**
     * 默认token前缀
     */
    private String tokenPrefix;
}

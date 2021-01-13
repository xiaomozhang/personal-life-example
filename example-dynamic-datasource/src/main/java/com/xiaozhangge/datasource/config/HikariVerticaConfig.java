package com.xiaozhangge.datasource.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xiaozhangge on 2019-03-20.
 */
@Data
@Configuration
@EqualsAndHashCode(callSuper = true)
@ConfigurationProperties(prefix = "spring.datasource.vertica.hikari")
public class HikariVerticaConfig extends HikariConfig {
}

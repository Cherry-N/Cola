package com.longxingyu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * {@code @Create:} 2023-02-28-9:15
 * {@code @Author:} 爱睡觉的小龙堡 ~
 * {@code @ToUser:} Be Happy EveryDay
 * --------------------------------------
 * {@code @note:}
 */

@SuppressWarnings({"all"})
@Configuration
public class CorsCofig {
    private static final long MAX_AGE = 60 * 60 * 24;

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setMaxAge(MAX_AGE);
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedHeader("*");
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
}

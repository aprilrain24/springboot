package com.ajacom.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liucm
 *         Date 2019/4/9
 *         Time 15:36
 */
@ConfigurationProperties(prefix = "ajacom.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}

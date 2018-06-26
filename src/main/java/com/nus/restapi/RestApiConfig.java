package com.nus.restapi;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * Contains the configuration related to the restapi service.
 * Configs under restapi should be defined in this class
 */
@Component
@ConfigurationProperties(prefix = "restapi")
public class RestApiConfig {

    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

}

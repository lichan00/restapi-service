package com.nus.restapi.service;

import com.nus.restapi.RestApiConfig;
import com.nus.restapi.domain.DataGov;
import com.nus.restapi.domain.Event;

import com.google.gson.Gson;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Service that connects to a URL and displays the output
 */

@Service
public class RestApiService {

    @Autowired
    RestApiConfig restApiConfig;


    public void getData() {
        CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier()).build();

        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);

        RestTemplate restTemplate = new RestTemplate(requestFactory);

        //connects to the URL using HTTP GET
        ResponseEntity<String> response = restTemplate.getForEntity(restApiConfig.getUrl(), String.class);

        //Converts string to java object
        DataGov result = new Gson().fromJson(response.getBody(), DataGov.class);

        for(Event event: result.getData()) {
            System.out.println(event);
            System.out.println();
        }
    }




}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.youtube_api.search;

import java.net.URI;

/**
 *
 * @author ono
 */
public class Director {
    private String url;
    private final Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    
    public <T, S> Object construct(T arg, Class<S> clazz){
        Object result = null;
        if(arg instanceof String){
            String term = (String)arg;
            URI uri = builder.getUri(term);
            result = builder.getResult(uri.toString(), clazz);
        }
        return result;
    }
    
}

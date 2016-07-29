/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.youtube_api;

import java.io.Serializable;
import com.wind_now.youtube_api.beans.SearchResponse;
import com.wind_now.youtube_api.search.Builder;
import com.wind_now.youtube_api.search.Director;
import com.wind_now.youtube_api.search.SearchBuilder;

/**
 *
 * @author ono
 */
public class Search implements Serializable{

    public SearchResponse search(String term) {
        return(this.invoke(term, new SearchBuilder(), SearchResponse.class));
    }
    private <T, S> T invoke(S arg, Builder builder, Class<T> clazz){
        T result;
        Director director = new Director(builder);
        result = (T)director.construct(arg, clazz);
        return result;
    }
}

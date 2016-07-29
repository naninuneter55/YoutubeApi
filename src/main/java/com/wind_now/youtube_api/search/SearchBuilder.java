/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.youtube_api.search;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author ono
 */
public class SearchBuilder extends Builder{

    @Override
    public URI getUri(String q) {
        List<NameValuePair> params = new ArrayList<>();
        String serverKey = System.getenv("GOOGLE_API_SERVER_KEY");
        params.add(new BasicNameValuePair("q", q));
        params.add(new BasicNameValuePair("key", serverKey));
        params.add(new BasicNameValuePair("maxResults", "50"));
        params.add(new BasicNameValuePair("order", "viewCount"));
        params.add(new BasicNameValuePair("part", "snippet"));
        params.add(new BasicNameValuePair("type", "video"));
        return(getUri(params));
    }

}

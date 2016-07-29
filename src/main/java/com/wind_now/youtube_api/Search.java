/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.youtube_api;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wind_now.youtube_api.beans.SearchResponse;
import com.wind_now.youtube_api.search.Builder;
import com.wind_now.youtube_api.search.Director;
import com.wind_now.youtube_api.search.SearchBuilder;

/**
 *
 * @author ono
 */
public class Search implements Serializable {

	static final Logger logger = LoggerFactory.getLogger(Search.class);

	public SearchResponse search(String term) {
		SearchResponse response = this.get(term, new SearchBuilder(), SearchResponse.class);
		logger.info("[{}] search() - result {} items. Completed.",
			term,
			String.valueOf(response.getItems().size()));
		return response;
	}

	@SuppressWarnings("unchecked")
	private <T, S> T get(S arg, Builder builder, Class<T> clazz) {
		T result;
		Director director = new Director(builder);
		result = (T) director.construct(arg, clazz);
		return result;
	}

}

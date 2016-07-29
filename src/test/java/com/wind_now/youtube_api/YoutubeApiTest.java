package com.wind_now.youtube_api;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wind_now.youtube_api.beans.SearchResponse;
import com.wind_now.youtube_api.beans.SearchResponse.Item;

/**
 *
 * @author ono
 */
public class YoutubeApiTest {

	// static final Logger logger = OnoLogger.getLogger();
	static final Logger logger = LoggerFactory.getLogger(YoutubeApiTest.class);

    public YoutubeApiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void search() throws Exception {
        String term = "吹奏楽";
        Search search = new Search();
        SearchResponse res = search.search(term);
        String actual = res.getKind();
        String expected = "youtube#searchListResponse";
        assertThat(actual, is(expected));
    }

}

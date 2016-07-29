/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.youtube_api.beans;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author ono
 */
@Data
public class SearchResponse implements Serializable {

    @SerializedName("kind")
    private String kind;

    @SerializedName("etag")
    private String etag;

    @SerializedName("nextPageToken")
    private String nextPageToken;

    @SerializedName("pageInfo")
    private PageInfo pageInfo;

    @SerializedName("items")
    private List<Item> items;

    @Data
    public class PageInfo {
        @SerializedName("totalResults")
        private Integer totalResults;

        @SerializedName("resultsPerPage")
        private Integer resultsPerPage;
    }

    @Data
    public class Item {
        @SerializedName("id")
        private Id id;
        @SerializedName("snippet")
        private Snippet snippet;
    }
    @Data
    public class Id {
        @SerializedName("kind")
        private String kind;
        @SerializedName("videoId")
        private String videoId;
    }
    @Data
    public class Snippet {
        @SerializedName("publishedAt")
        private String publishedAt;
        @SerializedName("channelId")
        private String channelId;
        @SerializedName("title")
        private String title;
        @SerializedName("description")
        private String description;
        @SerializedName("thumbnails")
        private Thumbnails thumbnails;
        @SerializedName("channelTitle")
        private String channelTitle;
        @SerializedName("liveBroadcastContent")
        private String liveBroadcastContent;
    }
    @Data
    public class Thumbnails {
        @SerializedName("default")
        private Thumbnail _default;
        @SerializedName("medium")
        private Thumbnail medium;
        @SerializedName("high")
        private Thumbnail high;
    }
    
    @Data
    public class Thumbnail {
        @SerializedName("url")
        private String url;
    }
}

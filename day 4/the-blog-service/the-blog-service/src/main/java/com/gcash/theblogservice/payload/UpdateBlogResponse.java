package com.gcash.theblogservice.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UpdateBlogResponse {

    @JsonProperty("id")
    private String userId;
    @JsonProperty("blogger_id")
    private String blogId;
    @JsonProperty("created_at")
    private LocalDateTime blogCreation;
    @JsonProperty("last_updated")
    private LocalDateTime blogUpdate;
}

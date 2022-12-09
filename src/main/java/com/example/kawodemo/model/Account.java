package com.example.kawodemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.mongodb.lang.NonNull;
import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Account {

    @CreatedDate
    Date createdAt;
    @LastModifiedDate
    Date modifiedAt;
    @CreatedBy
    private String createdByUser;
    @Id
    @Indexed(unique = true)
    private String id;
    @NonNull
    private String network;
    @NonNull
    private String networkUserId;
    private long viewCount;
    private long likeCount;
    @JsonProperty(access = Access.WRITE_ONLY)
    private boolean needsUpdate;

}

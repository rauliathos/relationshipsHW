package com.example.relationships.projections;


import com.example.relationships.models.Folder;
import com.example.relationships.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name= "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    User getUser();
}

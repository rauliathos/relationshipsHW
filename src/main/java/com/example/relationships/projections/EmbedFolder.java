
package com.example.relationships.projections;

import com.example.relationships.models.File;
import com.example.relationships.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
interface EmbedFolder {

    String getNAme();
    String getExtension();
    int getSize();
    Folder getFolder();

}

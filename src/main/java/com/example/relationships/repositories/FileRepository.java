package com.example.relationships.repositories;

import com.example.relationships.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exceptProjection = EmbedFolder.class)

public interface FileRepository extends JpaRepository<File, Long> {
}

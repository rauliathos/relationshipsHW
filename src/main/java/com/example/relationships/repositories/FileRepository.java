package com.example.relationships.repositories;

import com.example.relationships.models.File;
import com.example.relationships.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = Folder.class)

public interface FileRepository extends JpaRepository<File, Long> {
}

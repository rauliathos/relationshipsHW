package com.example.relationships.repositories;

import com.example.relationships.models.Folder;
import com.example.relationships.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = User.class)

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

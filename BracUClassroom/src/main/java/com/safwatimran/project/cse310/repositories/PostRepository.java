package com.safwatimran.project.cse310.repositories;

import com.safwatimran.project.cse310.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}

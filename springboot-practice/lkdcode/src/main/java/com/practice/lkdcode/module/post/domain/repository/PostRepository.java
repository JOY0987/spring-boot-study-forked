package com.practice.lkdcode.module.post.domain.repository;

import com.practice.lkdcode.module.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

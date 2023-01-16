package com.edicom.webservice.rest.restfulws.jpa;

import com.edicom.webservice.rest.restfulws.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

//JPA Repository for our social media Posts.
public interface PostRepository extends JpaRepository<Post, Integer> {

}

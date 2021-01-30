package com.webapiweekone.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.webapiweekone.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}

package com.webapiweekone.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.webapiweekone.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}

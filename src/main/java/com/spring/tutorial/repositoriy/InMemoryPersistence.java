package com.spring.tutorial.repositoriy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.tutorial.models.Post;

import lombok.Data;

@Repository
public @Data class InMemoryPersistence {

	private List<Post> posts;

	/**
	 * @param posts
	 */
	public InMemoryPersistence(List<Post> posts) {
		this.posts = new ArrayList<Post>();
		
		posts.add(new Post());
	}
	
	
	
	
}

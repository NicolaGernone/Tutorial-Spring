package com.spring.tutorial.repositoriy;

import java.util.ArrayList;
import java.util.Date;
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
	public InMemoryPersistence() {
		this.posts = new ArrayList<Post>();
		
		posts.add(new Post(1, "nuova carta 1", "http://localhost/img/post.jpg",new Date(),"SPRINg1"));
		posts.add(new Post(2, "nuova carta 2", "http://localhost/img/post.jpg",new Date(),"SPRINg2"));
		posts.add(new Post(3, "nuova carta 3", "http://localhost/img/post.jpg",new Date(),"SPRINg3"));
		posts.add(new Post(4, "nuova carta 4", "http://localhost/img/post.jpg",new Date(),"SPRINg4"));
		posts.add(new Post(5, "nuova carta 5", "http://localhost/img/post.jpg",new Date(),"SPRINg5"));
	}

	
}

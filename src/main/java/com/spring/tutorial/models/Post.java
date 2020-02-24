package com.spring.tutorial.models;

import java.util.Date;

import lombok.Data;

public @Data class Post {
	
	private int id;
	private String description;
	private String uriImg;
	private Date fecha;
	private String titulo;
	

}

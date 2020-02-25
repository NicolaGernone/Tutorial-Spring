package com.spring.tutorial.models;

import java.util.Date;

import lombok.Data;

public @Data class Post {
	
	
	private int id;
	private String description;
	private String uriImg;
	private Date fecha;
	private String titulo;
	/**
	 * @param id
	 * @param description
	 * @param uriImg
	 * @param fecha
	 * @param titulo
	 */
	public Post(int id, String description, String uriImg, Date fecha, String titulo) {
		this.id = id;
		this.description = description;
		this.uriImg = uriImg;
		this.fecha = fecha;
		this.titulo = titulo;
	}
	/**
	 * 
	 */
	public Post() {
	}
	
	
	
}

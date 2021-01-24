package com.example.notesservice.dto;

import lombok.Data;

public class NotesDto {
	
	private Integer id;
	private String title;
	private String author;
	private String description;
	private String status;

	public NotesDto(){

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public NotesDto(String title, String author, String description, String status) {
		super();
		this.title = title;
		this.author = author;
		this.description = description;
		this.status = status;
	}
}

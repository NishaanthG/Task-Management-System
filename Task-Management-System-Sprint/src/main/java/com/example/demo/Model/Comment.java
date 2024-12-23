package com.example.demo.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commentid;
	
	private String text;
	private LocalDateTime createdAt;
	
	@ManyToOne
	@JoinColumn(name = "TaskID")
	private Task task;
	
	@ManyToOne
	@JoinColumn(name = "UserID")
	private User user;

	public Comment() {
		super();
	}

	public Comment(int commentid, String text, LocalDateTime createdAt, Task task, User user) {
		super();
		this.commentid = commentid;
		this.text = text;
		this.createdAt = createdAt;
		this.task = task;
		this.user = user;
	}

	public int getCommentid() {
		return commentid;
	}

	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}

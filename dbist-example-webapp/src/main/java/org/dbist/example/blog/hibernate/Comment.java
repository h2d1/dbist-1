package org.dbist.example.blog.hibernate;

import java.util.Date;

import org.dbist.annotation.Column;
import org.dbist.annotation.ColumnType;

public class Comment {
	private String id;
	private String postId;
	@Column(type = ColumnType.LISTED)
	private String author;
	@Column(type = ColumnType.LISTED)
	private Date createdAt;
	@Column(type = ColumnType.TEXT)
	private String content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}

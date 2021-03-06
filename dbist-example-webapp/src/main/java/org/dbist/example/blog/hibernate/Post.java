package org.dbist.example.blog.hibernate;

import java.util.Date;

import org.dbist.annotation.Column;
import org.dbist.annotation.ColumnType;

public class Post {
	private String id;
	private String blogId;
	@Column(type = ColumnType.TITLE)
	private String title;
	@Column(type = ColumnType.LISTED)
	private String author;
	@Column(type = ColumnType.LISTED)
	private Date createdAt;
	@Column(type = ColumnType.LISTED)
	private Date updatedAt;
	@Column(type = ColumnType.TEXT)
	private String content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBlogId() {
		return blogId;
	}
	public void setBlogId(String blogId) {
		this.blogId = blogId;
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}

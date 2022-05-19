package com.web.demo.entity;
// Generated Jul 5, 2021, 11:28:02 AM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * ReplyCommentBlog generated by hbm2java
 */
@Entity
@Table(name = "reply_comment_blog", catalog = "megalodondb")
public class ReplyCommentBlog implements java.io.Serializable {


	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id_reply_comment_blog", unique = true, nullable = false)
	private Integer idReplyCommentBlog;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Id_commnet_blog", nullable = false)
	private CommentBlog commentBlog;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Id_users")
	private Users user;
	@Column(name = "Content_comment", length = 65535)
	private String contentComment;
	@Temporal(TemporalType.DATE)
	@Column(name = "date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	public ReplyCommentBlog() {
	}

	

	public ReplyCommentBlog(CommentBlog commentBlog,  String contentComment) {
		this.commentBlog = commentBlog;
	
		this.contentComment = contentComment;
	}

	
	public Integer getIdReplyCommentBlog() {
		return this.idReplyCommentBlog;
	}

	public void setIdReplyCommentBlog(Integer idReplyCommentBlog) {
		this.idReplyCommentBlog = idReplyCommentBlog;
	}


	public CommentBlog getCommentBlog() {
		return this.commentBlog;
	}

	public void setCommentBlog(CommentBlog commentBlog) {
		this.commentBlog = commentBlog;
	}




	
	public String getContentComment() {
		return this.contentComment;
	}

	public void setContentComment(String contentComment) {
		this.contentComment = contentComment;
	}
	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}
}
package com.capg.imdb;

public class Comments {
	private String comments;

	public Comments(String comments) {
		super();
		this.comments = comments;
	}

	public Comments() {
		super();
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Comments [comments=" + comments + "]";
	}

}
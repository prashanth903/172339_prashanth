package com.capg.imdb;

public class Comments {
private String rating;
private String comments;
public Comments(String rating, String comments) {
	super();
	this.rating = rating;
	this.comments = comments;
}
public Comments() {
	super();
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
@Override
public String toString() {
	return "Comments [rating=" + rating + ", comments=" + comments + "]";
}

}

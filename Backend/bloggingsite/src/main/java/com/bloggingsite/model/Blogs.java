package com.bloggingsite.model;

public class Blogs {
	
	private Integer blogsID;
	private String blogCategory;
	
	private String blogTitle;
	
	private String blogDescription;
	
	private String blogImage;
	
	private String blogDate;
	
	private String blogView;
	private String blogLike;
	public Blogs(Integer blogsID, String blogCategory, String blogTitle, String blogDescription, String blogImage,
			String blogDate, String blogView, String blogLike) {
		super();
		this.blogsID = blogsID;
		this.blogCategory = blogCategory;
		this.blogTitle = blogTitle;
		this.blogDescription = blogDescription;
		this.blogImage = blogImage;
		this.blogDate = blogDate;
		this.blogView = blogView;
		this.blogLike = blogLike;
	}
	
	public Blogs()
	{
		
	}

	public Integer getBlogsID() {
		return blogsID;
	}

	public void setBlogsID(Integer blogsID) {
		this.blogsID = blogsID;
	}

	public String getBlogCategory() {
		return blogCategory;
	}

	public void setBlogCategory(String blogCategory) {
		this.blogCategory = blogCategory;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogDescription() {
		return blogDescription;
	}

	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}

	public String getBlogImage() {
		return blogImage;
	}

	public void setBlogImage(String blogImage) {
		this.blogImage = blogImage;
	}

	public String getBlogDate() {
		return blogDate;
	}

	public void setBlogDate(String blogDate) {
		this.blogDate = blogDate;
	}

	public String getBlogView() {
		return blogView;
	}

	public void setBlogView(String blogView) {
		this.blogView = blogView;
	}

	public String getBlogLike() {
		return blogLike;
	}

	public void setBlogLike(String blogLike) {
		this.blogLike = blogLike;
	}

}

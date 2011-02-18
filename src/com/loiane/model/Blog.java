package com.loiane.model;

/**
 * Blog POJO
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public class Blog {

	private int id;
	private String name;
	private String url;
	
	public Blog(Integer id, String url) {
		this.id = id;
		this.url = url;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Blog: id = ").append(id).append(" ");
		sb.append("name = ").append(name).append(" ");
		sb.append("url = ").append(url).append("\n");
		return sb.toString();
	}
}

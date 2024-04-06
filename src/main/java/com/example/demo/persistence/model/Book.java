package com.example.demo.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;
    
    // Constructors
    
    public Book() {
    	super();
    }
    
    public Book(String title, String author) {
    	super();
    	this.title = title;
    	this.author = author;
    }
        
    // Getters
    
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}   
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
    // Setters
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		// TODO Auto-generated method stub
		this.author = author;
	}
	
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (this == obj) {
    		return true;
    	}
    	
    	if (obj == null) {
    		return false;
    	}
    	
    	if (getClass() != obj.getClass()) {
    		return false;
    	}
    	
    	Book other = (Book) obj;
    	
    	if (author == null) {
    		if (other.author != null) {
    			return false;
    		}
    	} else if (!author.equals(other.author)) {
    		return false;
    	}
    	
    	if (id != other.id) {
    		return false;
    	}
    	
    	if (title == null) {
    		if (other.title != null) {
    			return false;
    		}
    	} else if (!title.equals(other.title)) {
    		return false;
    	}
    	
    	return true;
    }
    
    @Override
    public String toString() {
    	return "Book [id = " + id +
    			"title = " + title +
    			"author = " + author + "]";
    }
}
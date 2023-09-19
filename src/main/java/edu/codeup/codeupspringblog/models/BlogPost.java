package edu.codeup.codeupspringblog.models;

import jakarta.persistence.*;

@Entity
@Table(name = "blog_posts")
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String body;

    public BlogPost(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public BlogPost(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public BlogPost() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
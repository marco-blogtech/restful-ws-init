package com.edicom.webservice.rest.restfulws.post;

import com.edicom.webservice.rest.restfulws.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

//POJO for our social media Post
@Entity
public class Post {

    @Id // Primary Key of our entity
    @GeneratedValue // Used to generate simple primary keys
    private Integer id;

    @NotNull
    @Size(min=1, message = "Post content should have at least 1 character") // Validation
    private String content;

    @ManyToOne(fetch = FetchType.LAZY) // Fetchtype = LAZY We only load on demand
    @JsonIgnore // We do not want user in our json
    private User user;

    // CONSTRUCTORS

    protected Post() {
    }

    public Post(Integer id, String content, User user) {
        this.id = id;
        this.content = content;
        this.user = user;
    }

    // SETTERS AND GETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // TO STRING

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}

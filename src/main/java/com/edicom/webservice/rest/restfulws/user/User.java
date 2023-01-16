package com.edicom.webservice.rest.restfulws.user;

import com.edicom.webservice.rest.restfulws.post.Post;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//POJO for our social media User
@Entity(name = "user_details") //In JPA there is a USER so we rename to user_details
//@JsonFilter("userFilter") //Filter name for User
public class User {

    @Id // Primary Key of our entity
    @GeneratedValue // Used to generate simple primary keys
    private Integer id;

    @Size(min=2, message = "Name should have at least 2 characters") // Validation
    @JsonProperty("user_name") // name should be written as user_name in our json
    private String name;

    @Size(min=8, message = "Password should have at least 8 characters") // Validation
    @JsonProperty("user_pass") // password should be written as user_pass in our json
    private String password;

    @Past(message = "Birth Date should be in the past")  // Validation - your BirthDate can not be in the future.
    @JsonProperty("birth_date") // birthDate should be written as birth_date in our json
    private LocalDate birthDate;

    @OneToMany(mappedBy = "user", orphanRemoval = true) // A user has more than 1 post
    @JsonIgnore
    private List<Post> posts = new ArrayList<Post>();

    // CONSTRUCTORS

    protected User() {
        this.id = null;
        this.name = null;
        this.password = null;
        this.birthDate = null;
    }

    public User(Integer id, String name, String password, LocalDate birthDate, List<Post> posts) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    // SETTERS AND GETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts.clear();
        this.posts.addAll(posts);
    }

    // TO STRING

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

}

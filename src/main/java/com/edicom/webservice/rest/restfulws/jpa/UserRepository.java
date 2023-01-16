package com.edicom.webservice.rest.restfulws.jpa;

import com.edicom.webservice.rest.restfulws.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

//User repository for our social media Users.
public interface UserRepository extends JpaRepository<User, Integer> {

}

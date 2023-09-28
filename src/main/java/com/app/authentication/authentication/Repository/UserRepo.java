package com.app.authentication.authentication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.authentication.authentication.Models.User;

public interface UserRepo extends JpaRepository<User, Long> {

}

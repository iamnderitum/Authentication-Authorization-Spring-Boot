package com.app.authentication.authentication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.authentication.authentication.Models.ReferenceInformation;

public interface ReferenceInfoRepo extends JpaRepository<ReferenceInformation, Long> {

}

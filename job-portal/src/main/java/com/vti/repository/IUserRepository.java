package com.vti.repository;

import com.vti.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IUserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
}

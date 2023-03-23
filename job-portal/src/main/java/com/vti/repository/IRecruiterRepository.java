package com.vti.repository;

import com.vti.entity.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IRecruiterRepository extends JpaRepository<Recruiter, Integer>, JpaSpecificationExecutor<Recruiter> {
}

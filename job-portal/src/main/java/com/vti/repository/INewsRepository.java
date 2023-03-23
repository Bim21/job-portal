package com.vti.repository;

import com.vti.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface INewsRepository extends JpaRepository<News, Integer>, JpaSpecificationExecutor<News> {
}

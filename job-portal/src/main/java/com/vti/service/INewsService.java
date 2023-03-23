package com.vti.service;

import com.vti.entity.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface INewsService {
    Page<News> getAllNews();


}

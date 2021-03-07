package com.neueda.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neueda.assignment.entity.UrlMapper;

@Repository
public interface UrlRepository extends JpaRepository<UrlMapper, Long> {

    UrlMapper findByShortUrl(String shortUrl);
    UrlMapper findByLongUrl(String longUrl);
}

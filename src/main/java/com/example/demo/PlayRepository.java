package com.example.demo;

import java.util.List;

import groovy.util.logging.PlatformLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PlayRepository extends JpaRepository<Play, Long> {
    @Query("SELECT p FROM  Play p WHERE CONCAT(p.name, ' ', p.name_group_actors, ' ', p.data , ' ', p.all_count_tickets, ' ',p.remain_count_tickets) LIKE %?1%")
    List<Play> search(String keyword);


}

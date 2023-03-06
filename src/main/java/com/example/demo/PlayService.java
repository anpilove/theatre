package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired; // для связи всех зависимостей в классах
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayService {
    @Autowired
    private PlayRepository repo;

    public List<Play> listAll(String keyword){
        if (keyword != null){
            return repo.search(keyword);
        }
        return repo.findAll();
    }

    public void save(Play play){
        repo.save(play);
    }

    public Play get(Long id){
        return repo.findById(id).get();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}

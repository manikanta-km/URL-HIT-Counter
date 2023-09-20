package com.example.URLHitCounter.repository;

import com.example.URLHitCounter.entities.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UrlHitRepo {
    @Autowired
    HashMap<String,User> userDB;
    private static Integer totalCount=0;
    public void increaseTotalCountBy1(){
        totalCount++;
    }
    public Integer getTotalCount(){
        return totalCount;
    }
    public HashMap<String, User> getDB(){
        return userDB;
    }
}

package com.example.URLHitCounter.Services;

import com.example.URLHitCounter.entities.User;
import com.example.URLHitCounter.repository.DataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class CountServices {
    @Autowired
    private DataHandler dataHandler;

    public void IncreaseCount(){
        dataHandler.increaseTotalCountBy1();
    }
    public Integer getTotalCount(){
        return dataHandler.getTotalCount();
    }
    public void IncreaseCounterUser(String userName){
        HashMap<String, User> db=dataHandler.getDB();
        User temp=db.getOrDefault(userName,new User(userName,0));
        temp.setHitCount(temp.getHitCount()+1);
        db.put(userName,temp);
        dataHandler.increaseTotalCountBy1();
    }
    public String getTotalHitCountForUser(String userName){
        HashMap<String, User> db=dataHandler.getDB();
        if(!db.containsKey(userName))return "User doesn't exist";
        return db.get(userName).getHitCount().toString();
    }
}

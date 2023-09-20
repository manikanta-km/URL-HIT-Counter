package com.example.URLHitCounter.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private String userName;
    private Integer hitCount;
}

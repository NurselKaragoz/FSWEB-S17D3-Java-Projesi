package com.workintech.restApi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Koala {
    private int id;
    private String name;
    private int weight;
    private int sleepHour;
    private int gender;

}

package com.workintech.restApi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Kangaroo {
    private int id;
    private String name;
    private int height;
    private int weight;
    private String gender;
    private boolean isAggressive;

}

package com.workintech.restApi.controller;

import com.workintech.restApi.entity.Kangaroo;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/workintech/kangaroos")

public class KangarooController {
    Map<Integer, Kangaroo> kangarooMap;


    @PostConstruct
            public void init(){
        kangarooMap=new HashMap<>();
        kangarooMap.put(1,new Kangaroo(1,"cici",2,120,"dişi",true));

    }
    @GetMapping("/")
    public List<Kangaroo> findAll(){
        return kangarooMap.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Kangaroo findById(@PathVariable int id){

        return kangarooMap.get(id);
    }
    @PostMapping("/")
    public Kangaroo addKangaroo(@RequestBody Kangaroo kangaroo) {

       kangarooMap.put(kangaroo.getId(), kangaroo);
        return kangarooMap.get(kangaroo.getId());

    }
    @PutMapping("/{id}")
    public void updateKangaroo(@RequestBody Kangaroo kangaroo){
        kangarooMap.replace(kangaroo.getId(), kangaroo);
    }
    @DeleteMapping("/{id}")
    public Kangaroo kangaroo(@RequestBody Kangaroo kangaroo){
       return kangarooMap.remove(kangaroo.getId());
    }

}

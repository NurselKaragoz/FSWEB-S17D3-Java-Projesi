package com.workintech.restApi.controller;

import com.workintech.restApi.entity.Kangaroo;
import com.workintech.restApi.entity.Koala;
import jakarta.annotation.PostConstruct;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech/koalas")
public class KoalaController {
    Map<Integer, Koala> koalas;
    @PostConstruct
    public void init(){
        koalas.put(2,new Koala(2,"uykucu",45,18,"erkek"));
    }

  @GetMapping("/")
           public List<Koala> findAll(){
          return koalas.values().stream().toList();
      }
   @GetMapping("/{id}")
    public Koala koala(@PathParam("id") Long id){
        Koala koala= new Koala();
       return koala;

   }
   @PostMapping("/")
    public Koala addKoalas(@RequestBody Koala koala){
       koalas.put(koala.getId(), koala);
       return koalas.get(koala.getId());


   }
    @PutMapping("/{id}")
    public void updateKoala(@RequestBody Koala koala){
        koalas.replace(koala.getId(), koala);
    }
    @DeleteMapping("/{id}")
    public Koala koala(@RequestBody Koala koala){
        return koalas.remove(koala.getId());
    }
}

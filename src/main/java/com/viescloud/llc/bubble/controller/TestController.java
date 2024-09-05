package com.viescloud.llc.bubble.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viescloud.llc.bubble.dao.ItemDao;
import com.viescloud.llc.bubble.model.Item;

@RestController
public class TestController {

    @Autowired
    private ItemDao itemDao;
    
    @GetMapping("/test1")
    public Item test1() {

        Item head = new Item();
        head.setTitle("Head");
        head.setIconLink("https://cdn-icons-png.flaticon.com/512/147/147144.png");
        head.setChildren(new HashSet<>());

        Item child1 = new Item();
        child1.setTitle("Child 1");
        child1.setIconLink("https://cdn-icons-png.flaticon.com/512/147/147144.png");

        Item child2 = new Item();
        child2.setTitle("Child 2");
        child2.setIconLink("https://cdn-icons-png.flaticon.com/512/147/147144.png");

        // this.itemDao.save(child1);
        // this.itemDao.save(child2);
        head.getChildren().add(child1);
        head.getChildren().add(child2);
        var result = this.itemDao.save(head);

        return result;
    }
}

package com.viescloud.llc.bubble.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viescloud.llc.bubble.model.Item;

public interface ItemDao extends JpaRepository<Item, Integer> {
    
}

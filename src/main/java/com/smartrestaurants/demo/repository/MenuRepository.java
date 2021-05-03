package com.smartrestaurants.demo.repository;

import com.smartrestaurants.demo.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

    void delete(Menu menu);
}

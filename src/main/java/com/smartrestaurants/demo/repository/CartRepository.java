package com.smartrestaurants.demo.repository;

import com.smartrestaurants.demo.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Integer> {

    Cart findByMenu( int menu);

    Cart findByMenuEquals(int menu);
}

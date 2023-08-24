package com.example.restaurant.wishlist.repository;

import org.springframework.stereotype.Repository;

import com.example.restaurant.db.MemoryDbRepositoryAbstract;
import com.example.restaurant.wishlist.entity.WishListEntity;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {

}

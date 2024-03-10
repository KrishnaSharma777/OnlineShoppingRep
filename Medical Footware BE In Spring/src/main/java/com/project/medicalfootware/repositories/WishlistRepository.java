package com.project.medicalfootware.repositories;

import com.project.medicalfootware.models.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishlistRepository extends JpaRepository<WishList, Long> {
    List<WishList> findAllByUserId(Long userId);
}

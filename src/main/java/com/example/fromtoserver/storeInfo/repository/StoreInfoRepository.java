package com.example.fromtoserver.storeInfo.repository;

import com.example.fromtoserver.storeInfo.domain.StoreInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreInfoRepository extends JpaRepository<StoreInfo, String> {
    List<StoreInfo> findAllByLatBetweenAndLngBetween(Double btm, Double top, Double lft, Double rgt);
}

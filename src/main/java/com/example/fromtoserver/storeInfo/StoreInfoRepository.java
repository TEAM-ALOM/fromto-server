package com.example.fromtoserver.storeInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreInfoRepository extends JpaRepository<StoreInfo, String> {
}

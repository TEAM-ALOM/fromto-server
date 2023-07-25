package com.example.fromtoserver.storeInfo.service;

import com.example.fromtoserver.storeInfo.StoreInfo;
import com.example.fromtoserver.storeInfo.repository.StoreInfoRepository;
import com.example.fromtoserver.storeInfo.request.StoreInfoSaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreInfoService {
    private final StoreInfoRepository storeInfoRepository;

    public StoreInfo save(StoreInfoSaveRequest storeInfoSaveRequest) {
        return storeInfoRepository.save(new StoreInfo(storeInfoSaveRequest));
    }

    public List<StoreInfo> getStoreInfoList(Double top, Double btm, Double lft, Double rgt){
        return storeInfoRepository.findAllByLatBetweenAndLngBetween(btm, top, lft, rgt);
    }
}

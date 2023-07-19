package com.example.fromtoserver.storeInfo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreInfoService {
    private StoreInfoRepository storeInfoRepository;
}

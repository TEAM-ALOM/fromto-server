package com.example.fromtoserver.storeInfo.controller;

import com.example.fromtoserver.common.BaseResponse;
import com.example.fromtoserver.storeInfo.response.StoreInfoRetrieveResponse;
import com.example.fromtoserver.storeInfo.service.StoreInfoService;
import com.example.fromtoserver.storeInfo.request.StoreInfoSaveRequest;
import com.example.fromtoserver.storeInfo.response.StoreInfoSaveResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/storeInfo")
public class StoreInfoController {
    private final StoreInfoService storeInfoService;
    @PostMapping(value = "")
    public BaseResponse<StoreInfoSaveResponse> saveStoreInfo(@RequestBody StoreInfoSaveRequest storeInfoSaveRequest){
        return BaseResponse.ofSuccess(new StoreInfoSaveResponse(storeInfoService.save(storeInfoSaveRequest)));
    }
    @GetMapping(value = "/list")
    public BaseResponse<List<StoreInfoRetrieveResponse>> getStoreInfoList(
                                                        @RequestParam Double top,
                                                        @RequestParam Double btm,
                                                        @RequestParam Double lft,
                                                        @RequestParam Double rgt) {
        return BaseResponse.ofSuccess(storeInfoService.getStoreInfoList(top, btm, lft, rgt).stream().map(StoreInfoRetrieveResponse::new).collect(Collectors.toList()));
    }
}

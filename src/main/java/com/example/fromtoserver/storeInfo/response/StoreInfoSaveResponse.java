package com.example.fromtoserver.storeInfo.response;

import com.example.fromtoserver.fromTo.response.FromToSaveResponse;
import com.example.fromtoserver.storeInfo.StoreInfo;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class StoreInfoSaveResponse {
    private double lat;
    private double lng;
    private List<FromToSaveResponse> fromToList;

    public StoreInfoSaveResponse(StoreInfo storeInfo) {
        this.lat = storeInfo.getLat();
        this.lng = storeInfo.getLng();
        this.fromToList = storeInfo.getFromToList().stream().map(FromToSaveResponse::new).collect(Collectors.toList());
    }
}

package com.example.fromtoserver.storeInfo.response;

import com.example.fromtoserver.fromTo.response.FromToRetrieveResponse;
import com.example.fromtoserver.storeInfo.StoreInfo;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class StoreInfoRetrieveResponse {
    private double lat;
    private double lng;
    private List<FromToRetrieveResponse> fromToList;

    public StoreInfoRetrieveResponse(StoreInfo storeInfo) {
        lat = storeInfo.getLat();
        lng = storeInfo.getLng();
        fromToList = storeInfo.getFromToList().stream().map(FromToRetrieveResponse::new).collect(Collectors.toList());
    }
}

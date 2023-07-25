package com.example.fromtoserver.storeInfo.request;

import com.example.fromtoserver.fromTo.request.FromToSaveRequest;
import lombok.Data;

import java.util.List;

@Data
public class StoreInfoSaveRequest {
    private String storeId;
    private double lat;
    private double lng;
    private List<FromToSaveRequest> fromToList;
}

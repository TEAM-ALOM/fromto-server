package com.example.fromtoserver.storeInfo.domain;

import com.example.fromtoserver.common.BaseEntity;
import com.example.fromtoserver.fromTo.domain.FromTo;
import com.example.fromtoserver.storeInfo.request.StoreInfoSaveRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Entity
@NoArgsConstructor
@Getter
public class StoreInfo extends BaseEntity {
    @Id
    @Column(name = "store_id")
    private String storeId;
    private double lat;
    private double lng;
    @OneToMany(mappedBy = "storeInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FromTo> fromToList;

    public StoreInfo(StoreInfoSaveRequest storeInfoSaveRequest) {
        this.storeId = storeInfoSaveRequest.getStoreId();
        this.lat = storeInfoSaveRequest.getLat();
        this.lng = storeInfoSaveRequest.getLng();
        this.fromToList = storeInfoSaveRequest.getFromToList().stream().map(FromTo::new).collect(Collectors.toList());
        this.fromToList.forEach(f -> f.setStoreInfo(this));
    }
}

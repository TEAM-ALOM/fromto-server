package com.example.fromtoserver.storeInfo;

import com.example.fromtoserver.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
public class StoreInfo extends BaseEntity {
    @Id
    private String storeId;
    private double lat;
    private double lng;
}

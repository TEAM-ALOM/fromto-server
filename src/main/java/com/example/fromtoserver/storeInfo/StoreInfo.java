package com.example.fromtoserver.storeInfo;

import com.example.fromtoserver.common.BaseEntity;
import com.example.fromtoserver.fromTo.FromTo;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
public class StoreInfo extends BaseEntity {
    @Id
    @Column(name = "store_info_id")
    private String storeId;
    private double lat;
    private double lng;
    @OneToMany(mappedBy = "storeInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FromTo> fromToList;
}

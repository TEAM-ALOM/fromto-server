package com.example.fromtoserver.fromTo;

import com.example.fromtoserver.storeInfo.StoreInfo;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;

@Entity
@NoArgsConstructor
public class FromTo {
    @Id
    @GeneratedValue
    private Long id;
    private DayOfWeek dayOfWeek;
    private Long openTime;
    private Long closeTime;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="store_info_id")
    private StoreInfo storeInfo;
}

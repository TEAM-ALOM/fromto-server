package com.example.fromtoserver.fromTo;

import com.example.fromtoserver.fromTo.request.FromToSaveRequest;
import com.example.fromtoserver.storeInfo.StoreInfo;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.ZoneId;

@Entity
@NoArgsConstructor
@Getter
public class FromTo {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;
    private Long openTime;
    private Long closeTime;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="store_id")
    private StoreInfo storeInfo;

    public FromTo(FromToSaveRequest fromToSaveRequest) {
        this.dayOfWeek = DayOfWeek.valueOf(fromToSaveRequest.getDayOfWeek());
        this.openTime = fromToSaveRequest.getOpenTime();
        this.closeTime = fromToSaveRequest.getCloseTime();
    }
}

package com.example.fromtoserver.fromTo.response;

import com.example.fromtoserver.fromTo.domain.FromTo;
import lombok.Data;

import java.time.DayOfWeek;

@Data
public class FromToSaveResponse {
    private DayOfWeek dayOfWeek;
    private Long openTime;
    private Long closeTime;

    public FromToSaveResponse(FromTo fromTo) {
        this.dayOfWeek = fromTo.getDayOfWeek();
        this.openTime = fromTo.getOpenTime();
        this.closeTime = fromTo.getCloseTime();
    }
}

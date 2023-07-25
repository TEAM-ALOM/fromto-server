package com.example.fromtoserver.fromTo.response;

import com.example.fromtoserver.fromTo.domain.FromTo;
import lombok.Data;

import java.time.DayOfWeek;

@Data
public class FromToRetrieveResponse {
    private DayOfWeek dayOfWeek;
    private Long openTime;
    private Long closeTime;

    public FromToRetrieveResponse(FromTo fromTo) {
        dayOfWeek = fromTo.getDayOfWeek();
        openTime = fromTo.getOpenTime();
        closeTime = fromTo.getCloseTime();
    }
}

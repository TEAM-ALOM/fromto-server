package com.example.fromtoserver.fromTo.request;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class FromToSaveRequest {
    private Integer dayOfWeek;
    private Long openTime;
    private Long closeTime;
}

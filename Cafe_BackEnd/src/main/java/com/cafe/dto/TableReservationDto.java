package com.cafe.dto;

import com.cafe.enums.ReservationStatus;
import lombok.Data;

import java.util.Date;

@Data
public class TableReservationDto {

    private Long id;

    private String tableType;

    private String description;

    private Date dateTime;

    private ReservationStatus reservationStatus;

    private Long userId;

    private String username;

}

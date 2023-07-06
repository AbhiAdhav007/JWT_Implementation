package com.assignment.JWT.Model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    private String name;

    private long contactDetails;

    private String address;

    private int pinCode;

}
